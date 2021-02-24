package martinamagdalenajukic.ferit.lv3_1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class PagerAdapter extends FragmentStatePagerAdapter{

    private static final int NUM_PAGES=3;
    //private List<Fragment> mItems; ako cemo listu koja se mijenja ne fiksno elemenata

    public PagerAdapter(@NonNull FragmentManager fm /*, List<Fragment> fragmentList*/){
        super(fm);
        //mItems=fragmentList;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return  SlideFragment.newInstance("This is fragment #1");
            case 1:
                return  SlideFragment.newInstance("This is fragment #2");
            case 2:
                return  SlideFragment.newInstance("This is fragment #3");
            default: return SlideFragment.newInstance("This is fragment #1");
        }
        //return mItems.get(position);
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
       // return mItems.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "Tab #"+(position+1);
    }
}
