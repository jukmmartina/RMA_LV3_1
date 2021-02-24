package martinamagdalenajukic.ferit.lv3_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SlideFragment extends Fragment {
    private static final String BUNDLE_KEY="display_message";

    private TextView mMessageTv;

    public static  SlideFragment newInstance(String message){  //ne moramo radit instanciranje fragmenta nego se moze koristit i vako
        SlideFragment fragment= new SlideFragment();
        Bundle args=new Bundle(); //spremiste podataka, bilo koji tip podatka, pohranjuje se preko keya
        args.putString(BUNDLE_KEY, message);  //posto mi saljemo string a moze bit putBoolean putInt, display_message kljuc
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_slide, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mMessageTv=view.findViewById(R.id.tvMessage);
        setUpTextView();
    }

    private void setUpTextView() {
        String message=getString(R.string.hello_world);
        if(getArguments()!=null){
            String argsMessage= getArguments().getString(BUNDLE_KEY);
            if(argsMessage!=null&& !argsMessage.isEmpty()) message=argsMessage;
        }
        mMessageTv.setText(message);
    }
}