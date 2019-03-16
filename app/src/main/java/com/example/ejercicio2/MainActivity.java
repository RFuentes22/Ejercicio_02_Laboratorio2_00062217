package com.example.ejercicio2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.content.res.Resources;

import java.util.Random;

public class MainActivity extends AppCompatActivity  {

    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    Random rand = new Random();
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.a);
        img2 = findViewById(R.id.b);
        img3 = findViewById(R.id.c);
        img4 = findViewById(R.id.d);
        img5 = findViewById(R.id.e);
        img6 = findViewById(R.id.f);
        img7 = findViewById(R.id.g);
        img8 = findViewById(R.id.h);
        img9 = findViewById(R.id.i);
        setButtonOnClickListeners();


    }

    private int nextImage() {

        int rndN = rand.nextInt(4)+ 1 ;
        String imgName = "img_" + rndN;
        Resources res = getResources();
        int id = res.getIdentifier(imgName, "drawable", getPackageName());


        return id;

    }

    private void setButtonOnClickListeners(){

        img1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View buttonClicked) {
                if(buttonClicked.getId() == R.id.a) {
                     img1.setBackgroundColor(Color.WHITE);
                     img1.setImageResource(nextImage());
                }
            }

        });
        img2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View buttonClicked) {
                if(buttonClicked.getId() == R.id.b) {
                    img2.setBackgroundColor(Color.WHITE);
                    img2.setImageResource(nextImage());
                }
            }

        });
        img3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View buttonClicked) {
                if(buttonClicked.getId() == R.id.c) {
                    img3.setBackgroundColor(Color.WHITE);
                    img3.setImageResource(nextImage());
                }
            }

        });
        img4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View buttonClicked) {
                if(buttonClicked.getId() == R.id.d) {
                    img4.setBackgroundColor(Color.WHITE);
                    img4.setImageResource(nextImage());
                }
            }

        });
        img5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View buttonClicked) {
                if(buttonClicked.getId() == R.id.e) {
                    img5.setBackgroundColor(Color.WHITE);
                    img5.setImageResource(nextImage());
                }
            }

        });
        img6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View buttonClicked) {
                if(buttonClicked.getId() == R.id.f) {
                    img6.setBackgroundColor(Color.WHITE);
                    img6.setImageResource(nextImage());
                }
            }

        });
        img7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View buttonClicked) {
                if(buttonClicked.getId() == R.id.g) {
                    img7.setBackgroundColor(Color.WHITE);
                    img7.setImageResource(nextImage());
                }
            }

        });
        img8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View buttonClicked) {
                if(buttonClicked.getId() == R.id.h) {
                    img8.setBackgroundColor(Color.WHITE);
                    img8.setImageResource(nextImage());
                }
            }

        });
        img9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View buttonClicked) {
                if(buttonClicked.getId() == R.id.i) {
                    img9.setBackgroundColor(Color.WHITE);
                    img9.setImageResource(nextImage());
                }
            }

        });


    }





}
