package com.example.kristian.layouttilsud;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        final TextView test = (TextView) findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (test.getBackground() instanceof ColorDrawable){
                    ColorDrawable bagfarve = (ColorDrawable)test.getBackground();
                    int color = bagfarve.getColor();
                    if (color==Color.GREEN){
                        test.setBackgroundColor(Color.BLUE);
                    }else {test.setBackgroundColor(Color.GREEN);}

                }else {test.setBackgroundColor(Color.GREEN);}


            }
        });

        final TextView test1 = (TextView)findViewById(R.id.test1);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test1.setBackgroundColor(Color.RED);
            }
        });
    }
}
