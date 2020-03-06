package in.vivekkumar.galleryimages;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import static in.vivekkumar.galleryimages.R.id.fragment_container;

public class MainActivity extends AppCompatActivity  {
    ImageView button9,button10,button11,button13,button14,button15,button1,button3,button4,button5,button6,button7;
    ImageView button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34;
    ImageView button35,button36,button37,button38,button39,button40;
    LinearLayout lyt1;
    RelativeLayout container;
    FrameLayout fragment_container;
    Fragment2 fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*if (Build.VERSION.SDK_INT < 16) {
            window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }*/
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);

        button9 = findViewById(R.id.button9);
        button10 = findViewById(R.id.button10);
        button11 = findViewById(R.id.button11);
        button13 = findViewById(R.id.button13);
        button14 = findViewById(R.id.button14);
        button15 = findViewById(R.id.button15);

        button23 = findViewById(R.id.button23);
        button24 = findViewById(R.id.button24);
        button25 = findViewById(R.id.button25);
        button26 = findViewById(R.id.button26);
        button27 = findViewById(R.id.button27);
        button28 = findViewById(R.id.button28);
        button29 = findViewById(R.id.button29);
        button30 = findViewById(R.id.button30);
        button31 = findViewById(R.id.button31);
        button32 = findViewById(R.id.button32);
        button33 = findViewById(R.id.button33);
        button34 = findViewById(R.id.button34);
        button35 = findViewById(R.id.button35);
        button36 = findViewById(R.id.button36);
        button37 = findViewById(R.id.button37);
        button38 = findViewById(R.id.button38);
        button39 = findViewById(R.id.button39);
        button40 = findViewById(R.id.button40);
        container = findViewById( R.id.container);
        fragment_container = findViewById(R.id.fragment_container);


        //lyt1 = findViewById(R.id.lyt1);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              /*  LayoutInflater li = LayoutInflater.from(MainActivity.this);
                View confirmDialog = li.inflate(R.layout.fragment_image_blurfrag, null);
                AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
                alert.setView(confirmDialog);
                final AlertDialog alertDialog = alert.create();
                alertDialog.show();
                */



                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.a, null);
                  ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "a");
                imageBlurfrag.setArguments(b);
              //  fragment_container.getForeground().setAlpha( 220);
               fragmentTransaction.add(R.id.container,imageBlurfrag);
               // getFragmentManager().beginTransaction().add(imageBlurfrag);
             fragmentTransaction.commit();


            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.b, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "b");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();


            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.c, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "c");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.d, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "d");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.e, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "e");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.f, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "f");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.g, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "g");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.g, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "g");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.h, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "h");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.i, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "i");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.j, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "j");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.k, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "k");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.l, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "l");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.m, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "m");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.n, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "n");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });


        button31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.o, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "o");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.p, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "p");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.q, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "q");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.r, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "r");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.s, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "s");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.t, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "t");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.u, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "u");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.v, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "v");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.w, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "w");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.x, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "x");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.n, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "n");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.a, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "a");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.a, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "b");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                // getFragmentManager().beginTransaction().add(imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.a, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "c");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                // getFragmentManager().beginTransaction().add(imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.a, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "d");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                // getFragmentManager().beginTransaction().add(imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.a, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "e");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                // getFragmentManager().beginTransaction().add(imageBlurfrag);
                fragmentTransaction.commit();

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fragmentTransaction =getSupportFragmentManager().beginTransaction();
                Resources res = getResources();
                Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.a, null);
                ImageBlurfrag imageBlurfrag = new ImageBlurfrag();
                Bundle b = new Bundle();
                b.putString("name", "f");
                imageBlurfrag.setArguments(b);

                fragmentTransaction.add(R.id.container,imageBlurfrag);
                // getFragmentManager().beginTransaction().add(imageBlurfrag);
                fragmentTransaction.commit();

            }
        });


    }

    public void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    public void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }


    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        fragment2.backpressed();
    }
}
