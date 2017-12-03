package com.example.kristian.layouttilsud;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int hehe;
    String ett = "1";
    String too = "2";
    String tree="3";
    String firee="4";
    String femm = "5";
    String sekss="6";
    String syvv="7";
    String ottee="8";
    String nii="9";
    String slett="";
    float faktor ;
    int dp11 ;
    int dp28;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        faktor= getResources().getDisplayMetrics().density;
        dp28= (int)(28*faktor+0.5f);
        dp11= (int) (11*faktor+0.5f);

        final TextView test1 = (TextView)findViewById(R.id.s1);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hehe= View.generateViewId();
                test1.setId(hehe);
            }
        });
        Button et = (Button)findViewById(R.id.et);
        et.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp11,0);
                xkd.setText(ett);


            }
        });
        Button to = (Button)findViewById(R.id.to);
        to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp11,0);
                xkd.setText(too);
            }
        });
        Button tre = (Button)findViewById(R.id.tre);
        tre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp11,0);
                xkd.setText(tree);
            }
        });
        Button fire = (Button)findViewById(R.id.fire);
        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp11,0);
                xkd.setText(firee);
            }
        });
        Button fem = (Button)findViewById(R.id.fem);
        fem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp11,0);
                xkd.setText(femm);
            }
        });
        Button seks = (Button)findViewById(R.id.seks);
        seks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp11,0);
                xkd.setText(sekss);
            }
        });
        Button syv = (Button)findViewById(R.id.syv);
        syv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp11,0);
                xkd.setText(syvv);
            }
        });
        Button otte = (Button)findViewById(R.id.otte);
        otte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp11,0);
                xkd.setText(ottee);
            }
        });
        Button ni = (Button)findViewById(R.id.ni);
        ni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp11,0);
                xkd.setText(nii);
            }
        });
        Button slet = (Button)findViewById(R.id.slet);
        slet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(hehe);
                xkd.setPadding(dp11,0,dp28,0);
                xkd.setText(slett);

            }
        });

    }

}
