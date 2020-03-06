package in.vivekkumar.galleryimages;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.app.Activity.RESULT_OK;


public class Fragment2 extends Fragment {

    private int currentApiVersion;
    LinearLayout llShowView = null;



    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ((MainActivity) getActivity()).hideSystemUI();

        View view = inflater.inflate(R.layout.fragment_fragment2,container,false);
        llShowView = (LinearLayout) view.findViewById(R.id.ll);
        ImageView img3 = view.findViewById(R.id.img3);
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().remove(Fragment2.this).commit();
                ((MainActivity) getActivity()).showSystemUI();
            }
        });
        TextView txt_imgname = view.findViewById(R.id.txt_imgname);
        Bundle b1= getArguments();
        if(b1 !=null){
            txt_imgname.setText(b1.getString("name"));
            if(txt_imgname.getText().toString().equalsIgnoreCase("a"))
            {
                img3.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.a));
            }
            if(txt_imgname.getText().toString().equalsIgnoreCase("b"))
            {
                img3.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.b));
            }
            if(txt_imgname.getText().toString().equalsIgnoreCase("c"))
            {
                img3.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.c));
            }
            if(txt_imgname.getText().toString().equalsIgnoreCase("d"))
            {
                img3.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.d));
            }
            if(txt_imgname.getText().toString().equalsIgnoreCase("e"))
            {
                img3.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.e));
            }
            if(txt_imgname.getText().toString().equalsIgnoreCase("f"))
            {
                img3.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.f));
            }
        }
        return view;

}
public void backpressed(){
    getFragmentManager().beginTransaction().remove(Fragment2.this).commit();
    ((MainActivity) getActivity()).showSystemUI();

}



}