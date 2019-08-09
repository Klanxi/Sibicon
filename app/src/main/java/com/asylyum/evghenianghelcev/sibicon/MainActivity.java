package com.asylyum.evghenianghelcev.sibicon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageButton btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    TextView textView;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);

        int[] images = {R.drawable.ic_one,R.drawable.ic_two,R.drawable.ic_three,R.drawable.ic_four,R.drawable.ic_five,R.drawable.ic_six,R.drawable.ic_seven,R.drawable.ic_eight,R.drawable.ic_nine};
        Random random = new Random();

        for (int i : images) {
            imageView.setImageResource(images[random.nextInt(images.length)]);
        }

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);

        TouchListener touchListener = new TouchListener(this);

        btn_1.setOnTouchListener(touchListener);
        btn_2.setOnTouchListener(touchListener);
        btn_3.setOnTouchListener(touchListener);
        btn_4.setOnTouchListener(touchListener);
        btn_5.setOnTouchListener(touchListener);
        btn_6.setOnTouchListener(touchListener);
        btn_7.setOnTouchListener(touchListener);
        btn_8.setOnTouchListener(touchListener);
        btn_9.setOnTouchListener(touchListener);



    }


}
