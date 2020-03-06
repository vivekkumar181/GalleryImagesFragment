package in.vivekkumar.galleryimages;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;


public class ImageBlurfrag extends Fragment {

    ImageView imgcancel;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image_blurfrag,container,false);
        Button btn_view = view.findViewById(R.id.btn_view);
        ImageView fragimage=view.findViewById(R.id.fragimage);
        final TextView txt1 = view.findViewById(R.id.txt1);
        imgcancel = view.findViewById(R.id.imgcancel);
        MainActivity mainActivity = (MainActivity) getActivity();
        //String mydata=mainActivity.getMy
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        getActivity().getWindow().addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND);

        Bundle b2= getArguments();
        txt1.setText(b2.getString("name"));
        if(txt1.getText().toString().equalsIgnoreCase("a"))
        {
        fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.a));
        }
        else if(txt1.getText().toString().equalsIgnoreCase("b"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.b));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("c"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.c));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("d"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.d));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("e"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.e));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("f"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.f));
        }



        else if(txt1.getText().toString().equalsIgnoreCase("g"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.g));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("h"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.h));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("i"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.i));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("j"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.j));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("k"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.k));
        }



        else if(txt1.getText().toString().equalsIgnoreCase("l"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.l));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("m"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.m));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("n"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.n));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("o"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.o));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("p"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.p));
        }



        else if(txt1.getText().toString().equalsIgnoreCase("q"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.q));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("r"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.r));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("s"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.s));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("t"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.t));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("u"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.v));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("v"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.v));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("w"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.w));
        }

        else if(txt1.getText().toString().equalsIgnoreCase("x"))
        {
            fragimage.setImageDrawable(ContextCompat.getDrawable(getActivity(),R.drawable.x));
        }

        Bundle b1= getArguments();
        btn_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 if(txt1.getText().toString().equalsIgnoreCase("a"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","a");
                    b.putString("image", String.valueOf(R.drawable.a));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("b"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","b");
                    b.putString("image", String.valueOf(R.drawable.b));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("c"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","c");
                    b.putString("image", String.valueOf(R.drawable.c));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("d"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","d");
                    b.putString("image", String.valueOf(R.drawable.d));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("e"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","e");
                    b.putString("image", String.valueOf(R.drawable.e));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("f"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","f");
                    b.putString("image", String.valueOf(R.drawable.f));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }


                if(txt1.getText().toString().equalsIgnoreCase("g"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","g");
                    b.putString("image", String.valueOf(R.drawable.g));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("h"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","h");
                    b.putString("image", String.valueOf(R.drawable.h));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("i"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","j");
                    b.putString("image", String.valueOf(R.drawable.i));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("j"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","k");
                    b.putString("image", String.valueOf(R.drawable.j));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("k"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","l");
                    b.putString("image", String.valueOf(R.drawable.k));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }

                if(txt1.getText().toString().equalsIgnoreCase("l"))
                {
                    Fragment2 fr2 = new Fragment2();
                    Bundle b = new Bundle();
                    b.putString("name","m");
                    b.putString("image", String.valueOf(R.drawable.l));
                    fr2.setArguments(b);
                    getFragmentManager().beginTransaction().add(R.id.container,fr2).commit();

                }



            }
        });

      /*  Button btn_cancel =view.findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              getFragmentManager().beginTransaction().remove(ImageBlurfrag.this).commit();

            }
        });*/

        imgcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().beginTransaction().remove(ImageBlurfrag.this).commit();
            }
        });



        return view;
    }






}
