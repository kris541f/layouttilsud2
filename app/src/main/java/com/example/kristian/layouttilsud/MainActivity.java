package com.example.kristian.layouttilsud;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

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
    int dp27;


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        faktor= getResources().getDisplayMetrics().density;
        dp27= (int)(27*faktor+0.5f);
        dp11= (int) (11*faktor+0.5f);
        PuzzleGenerator pg = new PuzzleGenerator();
        Puzzle puslespil = pg.getPuzzle();





        final TextView s1 = (TextView)findViewById(R.id.s1);


        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s1.setTextColor(Color.BLUE);
                    }else {s1.setTextColor(Color.BLUE);}

                hehe= View.generateViewId();
                s1.setId(hehe);


            }
        });
        if (puslespil.getField(0)!=0){
            s1.setText(Integer.toString(puslespil.getField(0)));
            s1.setClickable(false);}
        else{
            s1.setText("");
            s1.setPadding(dp11,0,dp27,0);}

        final TextView s2 = (TextView)findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s2.setTextColor(Color.BLUE);
                }else {s2.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s2.setId(hehe);



            }
        });
        if (puslespil.getField(1)!=0){
            s2.setText(Integer.toString(puslespil.getField(1)));
            s2.setClickable(false);}
        else{
            s2.setText("");
            s2.setPadding(dp11,0,dp27,0);}
        final TextView s3 = (TextView)findViewById(R.id.s3);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s3.setTextColor(Color.BLUE);
                }else {s3.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s3.setId(hehe);
            }
        });
            if (puslespil.getField(2)!=0){
                s3.setText(Integer.toString(puslespil.getField(2)));
                s3.setClickable(false);}
            else{
                s3.setText("");
                s3.setPadding(dp11,0,dp27,0);}
        final TextView s4 = (TextView)findViewById(R.id.s4);
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s4.setTextColor(Color.BLUE);
                }else {s4.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s4.setId(hehe);
            }
        });
        if (puslespil.getField(3)!=0){
            s4.setText(Integer.toString(puslespil.getField(3)));
            s4.setClickable(false);}
        else{
            s4.setText("");
            s4.setPadding(dp11,0,dp27,0);}
        final TextView s5 = (TextView)findViewById(R.id.s5);
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s5.setTextColor(Color.BLUE);
                }else {s5.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s5.setId(hehe);
            }
        });
        if (puslespil.getField(4)!=0){
            s5.setText(Integer.toString(puslespil.getField(4)));
            s5.setClickable(false);}
        else{
            s5.setText("");
            s5.setPadding(dp11,0,dp27,0);}
        final TextView s6 = (TextView)findViewById(R.id.s6);
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s6.setTextColor(Color.BLUE);
                }else {s6.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s6.setId(hehe);
            }
        });
        if (puslespil.getField(5)!=0){
            s6.setText(Integer.toString(puslespil.getField(5)));
            s6.setClickable(false);}
        else{
            s6.setText("");
            s6.setPadding(dp11,0,dp27,0);}
        final TextView s7 = (TextView)findViewById(R.id.s7);
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s7.setTextColor(Color.BLUE);
                }else {s7.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s7.setId(hehe);
            }
        });

            if (puslespil.getField(6)!=0){
                s7.setText(Integer.toString(puslespil.getField(6)));
                s7.setClickable(false);}
            else{
                s7.setText("");
                s7.setPadding(dp11,0,dp27,0);}
        final TextView s8 = (TextView)findViewById(R.id.s8);
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s8.setTextColor(Color.BLUE);
                }else {s8.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s8.setId(hehe);
            }
        });
        if (puslespil.getField(7)!=0){
            s8.setText(Integer.toString(puslespil.getField(7)));
            s8.setClickable(false);}
        else{
            s8.setText("");
            s8.setPadding(dp11,0,dp27,0);}
        final TextView s9 = (TextView)findViewById(R.id.s9);
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s9.setTextColor(Color.BLUE);
                }else {s9.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s9.setId(hehe);
            }
        });
        if (puslespil.getField(8)!=0){
            s9.setText(Integer.toString(puslespil.getField(8)));
            s9.setClickable(false);}
        else{
            s9.setText("");
            s9.setPadding(dp11,0,dp27,0);}
        final TextView s10 = (TextView)findViewById(R.id.s10);
        s10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s10.setTextColor(Color.BLUE);
                }else {s10.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s10.setId(hehe);
            }
        });
        if (puslespil.getField(9)!=0){
            s10.setText(Integer.toString(puslespil.getField(9)));
            s10.setClickable(false);}
        else{
            s10.setText("");
            s10.setPadding(dp11,0,dp27,0);}
        final TextView s11 = (TextView)findViewById(R.id.s11);
        s11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s11.setTextColor(Color.BLUE);
                }else {s11.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s11.setId(hehe);
            }
        });
        if (puslespil.getField(10)!=0){
            s11.setText(Integer.toString(puslespil.getField(10)));
            s11.setClickable(false);}
        else{
            s11.setText("");
            s11.setPadding(dp11,0,dp27,0);}
        final TextView s12 = (TextView)findViewById(R.id.s12);
        s12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s12.setTextColor(Color.BLUE);
                }else {s12.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s12.setId(hehe);
            }
        });
        if (puslespil.getField(11)!=0){
            s12.setText(Integer.toString(puslespil.getField(11)));
            s12.setClickable(false);}
        else{
            s12.setText("");
            s12.setPadding(dp11,0,dp27,0);}
        final TextView s13 = (TextView)findViewById(R.id.s13);
        s13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s13.setTextColor(Color.BLUE);
                }else {s13.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s13.setId(hehe);
            }
        });
        if (puslespil.getField(12)!=0){
            s13.setText(Integer.toString(puslespil.getField(12)));
            s13.setClickable(false);}
        else{
            s13.setText("");
            s13.setPadding(dp11,0,dp27,0);}
        final TextView s14 = (TextView)findViewById(R.id.s14);
        s14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s14.setTextColor(Color.BLUE);
                }else {s14.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s14.setId(hehe);
            }
        });
        if (puslespil.getField(13)!=0){
            s14.setText(Integer.toString(puslespil.getField(13)));
            s14.setClickable(false);}
        else{
            s14.setText("");
            s14.setPadding(dp11,0,dp27,0);}

        final TextView s15 = (TextView)findViewById(R.id.s15);
        s15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s15.setTextColor(Color.BLUE);
                }else {s15.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s15.setId(hehe);
            }
        });
        if (puslespil.getField(14)!=0){
            s15.setText(Integer.toString(puslespil.getField(14)));
            s15.setClickable(false);}
        else{
            s15.setText("");
            s15.setPadding(dp11,0,dp27,0);}


        final TextView s16 = (TextView)findViewById(R.id.s16);
        s16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s16.setTextColor(Color.BLUE);
                }else {s16.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s16.setId(hehe);
            }
        });
        if (puslespil.getField(15)!=0){
            s16.setText(Integer.toString(puslespil.getField(15)));
            s16.setClickable(false);}
        else{
            s16.setText("");
            s16.setPadding(dp11,0,dp27,0);}

        final TextView s17 = (TextView)findViewById(R.id.s17);
        s17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s17.setTextColor(Color.BLUE);
                }else {s17.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s17.setId(hehe);
            }
        });
        if (puslespil.getField(16)!=0){
            s17.setText(Integer.toString(puslespil.getField(16)));
            s17.setClickable(false);}
        else{
            s17.setText("");
            s17.setPadding(dp11,0,dp27,0);}
        final TextView s18 = (TextView)findViewById(R.id.s18);
        s18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s18.setTextColor(Color.BLUE);
                }else {s18.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s18.setId(hehe);
            }
        });
        if (puslespil.getField(17)!=0){
            s18.setText(Integer.toString(puslespil.getField(17)));
            s18.setClickable(false);}
        else{
            s18.setText("");
            s18.setPadding(dp11,0,dp27,0);}
        final TextView s19 = (TextView)findViewById(R.id.s19);
        s19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s19.setTextColor(Color.BLUE);
                }else {s19.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s19.setId(hehe);
            }
        });
        if (puslespil.getField(18)!=0){
            s19.setText(Integer.toString(puslespil.getField(18)));
            s19.setClickable(false);}
        else{
            s19.setText("");
            s19.setPadding(dp11,0,dp27,0);}

        final TextView s20 = (TextView)findViewById(R.id.s20);
        s20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s20.setTextColor(Color.BLUE);
                }else {s20.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s20.setId(hehe);
            }
        });
        if (puslespil.getField(19)!=0){
            s20.setText(Integer.toString(puslespil.getField(19)));
            s20.setClickable(false);}
        else{
            s20.setText("");
            s20.setPadding(dp11,0,dp27,0);}
        final TextView s21 = (TextView)findViewById(R.id.s21);
        s21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s21.setTextColor(Color.BLUE);
                }else {s21.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s21.setId(hehe);
            }
        });
        if (puslespil.getField(20)!=0){
            s21.setText(Integer.toString(puslespil.getField(20)));
            s21.setClickable(false);}
        else{
            s21.setText("");
            s21.setPadding(dp11,0,dp27,0);}

        final TextView s22 = (TextView)findViewById(R.id.s22);
        s22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s22.setTextColor(Color.BLUE);
                }else {s22.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s22.setId(hehe);
            }
        });
        if (puslespil.getField(21)!=0){
            s22.setText(Integer.toString(puslespil.getField(21)));
            s22.setClickable(false);}
        else{
            s22.setText("");
            s22.setPadding(dp11,0,dp27,0);}

        final TextView s23 = (TextView)findViewById(R.id.s23);
        s23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s23.setTextColor(Color.BLUE);
                }else {s23.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s23.setId(hehe);
            }
        });
        if (puslespil.getField(22)!=0){
            s23.setText(Integer.toString(puslespil.getField(22)));
            s23.setClickable(false);}
        else{
            s23.setText("");
            s23.setPadding(dp11,0,dp27,0);}

        final TextView s24 = (TextView)findViewById(R.id.s24);
        s24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s24.setTextColor(Color.BLUE);
                }else {s24.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s24.setId(hehe);
            }
        });
        if (puslespil.getField(23)!=0){
            s24.setText(Integer.toString(puslespil.getField(23)));
            s24.setClickable(false);}
        else{
            s24.setText("");
            s24.setPadding(dp11,0,dp27,0);}

        final TextView s25 = (TextView)findViewById(R.id.s25);
        s25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s25.setTextColor(Color.BLUE);
                }else {s25.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s25.setId(hehe);
            }
        });
        if (puslespil.getField(24)!=0){
            s25.setText(Integer.toString(puslespil.getField(24)));
            s25.setClickable(false);}
        else{
            s25.setText("");
            s25.setPadding(dp11,0,dp27,0);}

        final TextView s26 = (TextView)findViewById(R.id.s26);
        s26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s26.setTextColor(Color.BLUE);
                }else {s26.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s26.setId(hehe);
            }
        });
        if (puslespil.getField(25)!=0){
            s26.setText(Integer.toString(puslespil.getField(25)));
            s26.setClickable(false);}
        else{
            s26.setText("");
            s26.setPadding(dp11,0,dp27,0);}

        final TextView s27 = (TextView)findViewById(R.id.s27);
        s27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s27.setTextColor(Color.BLUE);
                }else {s27.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s27.setId(hehe);
            }
        });
        if (puslespil.getField(26)!=0){
            s27.setText(Integer.toString(puslespil.getField(26)));
            s27.setClickable(false);}
        else{
            s27.setText("");
            s27.setPadding(dp11,0,dp27,0);}

        final TextView s28 = (TextView)findViewById(R.id.s28);
        s28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s28.setTextColor(Color.BLUE);
                }else {s28.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s28.setId(hehe);
            }
        });
        if (puslespil.getField(27)!=0){
            s28.setText(Integer.toString(puslespil.getField(27)));
            s28.setClickable(false);}
        else{
            s28.setText("");
            s28.setPadding(dp11,0,dp27,0);}

        final TextView s29 = (TextView)findViewById(R.id.s29);
        s29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s29.setTextColor(Color.BLUE);
                }else {s29.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s29.setId(hehe);
            }
        });
        if (puslespil.getField(28)!=0){
            s29.setText(Integer.toString(puslespil.getField(28)));
            s29.setClickable(false);}
        else{
            s29.setText("");
            s29.setPadding(dp11,0,dp27,0);}

        final TextView s30 = (TextView)findViewById(R.id.s30);
        s30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s30.setTextColor(Color.BLUE);
                }else {s30.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s30.setId(hehe);
            }
        });
        if (puslespil.getField(29)!=0){
            s30.setText(Integer.toString(puslespil.getField(29)));
            s30.setClickable(false);}
        else{
            s30.setText("");
            s30.setPadding(dp11,0,dp27,0);}

        final TextView s31 = (TextView)findViewById(R.id.s31);
        s31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s31.setTextColor(Color.BLUE);
                }else {s31.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s31.setId(hehe);
            }
        });
        if (puslespil.getField(30)!=0){
            s31.setText(Integer.toString(puslespil.getField(30)));
            s31.setClickable(false);}
        else{
            s31.setText("");
            s31.setPadding(dp11,0,dp27,0);}

        final TextView s32 = (TextView)findViewById(R.id.s32);
        s32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s32.setTextColor(Color.BLUE);
                }else {s32.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s32.setId(hehe);
            }
        });
        if (puslespil.getField(31)!=0){
            s32.setText(Integer.toString(puslespil.getField(31)));
            s32.setClickable(false);}
        else{
            s32.setText("");
            s32.setPadding(dp11,0,dp27,0);}

        final TextView s33 = (TextView)findViewById(R.id.s33);
        s33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s33.setTextColor(Color.BLUE);
                }else {s33.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s33.setId(hehe);
            }
        });
        if (puslespil.getField(32)!=0){
            s33.setText(Integer.toString(puslespil.getField(32)));
            s33.setClickable(false);}
        else{
            s33.setText("");
            s33.setPadding(dp11,0,dp27,0);}

        final TextView s34 = (TextView)findViewById(R.id.s34);
        s34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s34.setTextColor(Color.BLUE);
                }else {s34.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s34.setId(hehe);
            }
        });
        if (puslespil.getField(33)!=0){
            s34.setText(Integer.toString(puslespil.getField(33)));
            s34.setClickable(false);}
        else{
            s34.setText("");
            s34.setPadding(dp11,0,dp27,0);}

        final TextView s35 = (TextView)findViewById(R.id.s35);
        s35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s35.setTextColor(Color.BLUE);
                }else {s35.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s35.setId(hehe);
            }
        });
        if (puslespil.getField(34)!=0){
            s35.setText(Integer.toString(puslespil.getField(34)));
            s35.setClickable(false);}
        else{
            s35.setText("");
            s35.setPadding(dp11,0,dp27,0);}

        final TextView s36 = (TextView)findViewById(R.id.s36);
        s36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s36.setTextColor(Color.BLUE);
                }else {s36.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s36.setId(hehe);
            }
        });
        if (puslespil.getField(35)!=0){
            s36.setText(Integer.toString(puslespil.getField(35)));
            s36.setClickable(false);}
        else{
            s36.setText("");
            s36.setPadding(dp11,0,dp27,0);}

        final TextView s37 = (TextView)findViewById(R.id.s37);
        s37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s37.setTextColor(Color.BLUE);
                }else {s37.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s37.setId(hehe);
            }
        });
        if (puslespil.getField(36)!=0){
            s37.setText(Integer.toString(puslespil.getField(36)));
            s37.setClickable(false);}
        else{
            s37.setText("");
            s37.setPadding(dp11,0,dp27,0);}

        final TextView s38 = (TextView)findViewById(R.id.s38);
        s38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s38.setTextColor(Color.BLUE);
                }else {s38.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s38.setId(hehe);
            }
        });
        if (puslespil.getField(37)!=0){
            s38.setText(Integer.toString(puslespil.getField(37)));
            s38.setClickable(false);}
        else{
            s38.setText("");
            s38.setPadding(dp11,0,dp27,0);}

        final TextView s39 = (TextView)findViewById(R.id.s39);
        s39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s39.setTextColor(Color.BLUE);
                }else {s39.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s39.setId(hehe);
            }
        });
        if (puslespil.getField(38)!=0){
            s39.setText(Integer.toString(puslespil.getField(38)));
            s39.setClickable(false);}
        else{
            s39.setText("");
            s39.setPadding(dp11,0,dp27,0);}

        final TextView s40 = (TextView)findViewById(R.id.s40);
        s40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s40.setTextColor(Color.BLUE);
                }else {s40.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s40.setId(hehe);
            }
        });
        if (puslespil.getField(39)!=0){
            s40.setText(Integer.toString(puslespil.getField(39)));
            s40.setClickable(false);}
        else{
            s40.setText("");
            s40.setPadding(dp11,0,dp27,0);}

        final TextView s41 = (TextView)findViewById(R.id.s41);
        s41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s41.setTextColor(Color.BLUE);
                }else {s41.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s41.setId(hehe);
            }
        });
        if (puslespil.getField(40)!=0){
            s41.setText(Integer.toString(puslespil.getField(40)));
            s41.setClickable(false);}
        else{
            s41.setText("");
            s41.setPadding(dp11,0,dp27,0);}

        final TextView s42 = (TextView)findViewById(R.id.s42);
        s42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s42.setTextColor(Color.BLUE);
                }else {s42.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s42.setId(hehe);
            }
        });
        if (puslespil.getField(41)!=0){
            s42.setText(Integer.toString(puslespil.getField(41)));
            s42.setClickable(false);}
        else{
            s42.setText("");
            s42.setPadding(dp11,0,dp27,0);}

        final TextView s43 = (TextView)findViewById(R.id.s43);
        s43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s43.setTextColor(Color.BLUE);
                }else {s43.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s43.setId(hehe);
            }
        });
        if (puslespil.getField(42)!=0){
            s43.setText(Integer.toString(puslespil.getField(42)));
            s43.setClickable(false);}
        else{
            s43.setText("");
            s43.setPadding(dp11,0,dp27,0);}

        final TextView s44 = (TextView)findViewById(R.id.s44);
        s44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s44.setTextColor(Color.BLUE);
                }else {s44.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s44.setId(hehe);
            }
        });
        if (puslespil.getField(43)!=0){
            s44.setText(Integer.toString(puslespil.getField(43)));
            s44.setClickable(false);}
        else{
            s44.setText("");
            s44.setPadding(dp11,0,dp27,0);}

        final TextView s45 = (TextView)findViewById(R.id.s45);
        s45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s45.setTextColor(Color.BLUE);
                }else {s45.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s45.setId(hehe);
            }
        });
        if (puslespil.getField(44)!=0){
            s45.setText(Integer.toString(puslespil.getField(44)));
            s45.setClickable(false);}
        else{
            s45.setText("");
            s45.setPadding(dp11,0,dp27,0);}

        final TextView s46 = (TextView)findViewById(R.id.s46);
        s46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s46.setTextColor(Color.BLUE);
                }else {s46.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s46.setId(hehe);
            }
        });
        if (puslespil.getField(45)!=0){
            s46.setText(Integer.toString(puslespil.getField(45)));
            s46.setClickable(false);}
        else{
            s46.setText("");
            s46.setPadding(dp11,0,dp27,0);}

        final TextView s47 = (TextView)findViewById(R.id.s47);
        s47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s47.setTextColor(Color.BLUE);
                }else {s47.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s47.setId(hehe);
            }
        });
        if (puslespil.getField(46)!=0){
            s47.setText(Integer.toString(puslespil.getField(46)));
            s47.setClickable(false);}
        else{
            s47.setText("");
            s47.setPadding(dp11,0,dp27,0);}

        final TextView s48 = (TextView)findViewById(R.id.s48);
        s48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s48.setTextColor(Color.BLUE);
                }else {s48.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s48.setId(hehe);
            }
        });
        if (puslespil.getField(47)!=0){
            s48.setText(Integer.toString(puslespil.getField(47)));
            s48.setClickable(false);}
        else{
            s48.setText("");
            s48.setPadding(dp11,0,dp27,0);}

        final TextView s49 = (TextView)findViewById(R.id.s49);
        s49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s49.setTextColor(Color.BLUE);
                }else {s49.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s49.setId(hehe);
            }
        });
        if (puslespil.getField(48)!=0){
            s49.setText(Integer.toString(puslespil.getField(48)));
            s49.setClickable(false);}
        else{
            s49.setText("");
            s49.setPadding(dp11,0,dp27,0);}

        final TextView s50 = (TextView)findViewById(R.id.s50);
        s50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s50.setTextColor(Color.BLUE);
                }else {s50.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s50.setId(hehe);
            }
        });
        if (puslespil.getField(49)!=0){
            s50.setText(Integer.toString(puslespil.getField(49)));
            s50.setClickable(false);}
        else{
            s50.setText("");
            s50.setPadding(dp11,0,dp27,0);}

        final TextView s51 = (TextView)findViewById(R.id.s51);
        s51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s51.setTextColor(Color.BLUE);
                }else {s51.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s51.setId(hehe);
            }
        });
        if (puslespil.getField(50)!=0){
            s51.setText(Integer.toString(puslespil.getField(50)));
            s51.setClickable(false);}
        else{
            s51.setText("");
            s51.setPadding(dp11,0,dp27,0);}

        final TextView s52 = (TextView)findViewById(R.id.s52);
        s52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s52.setTextColor(Color.BLUE);
                }else {s52.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s52.setId(hehe);
            }
        });
        if (puslespil.getField(51)!=0){
            s52.setText(Integer.toString(puslespil.getField(51)));
            s52.setClickable(false);}
        else{
            s52.setText("");
            s52.setPadding(dp11,0,dp27,0);}

        final TextView s53 = (TextView)findViewById(R.id.s53);
        s53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s53.setTextColor(Color.BLUE);
                }else {s53.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s53.setId(hehe);
            }
        });
        if (puslespil.getField(52)!=0){
            s53.setText(Integer.toString(puslespil.getField(52)));
            s53.setClickable(false);}
        else{
            s53.setText("");
            s53.setPadding(dp11,0,dp27,0);}

        final TextView s54 = (TextView)findViewById(R.id.s54);
        s54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s54.setTextColor(Color.BLUE);
                }else {s54.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s54.setId(hehe);
            }
        });
        if (puslespil.getField(53)!=0){
            s54.setText(Integer.toString(puslespil.getField(53)));
            s54.setClickable(false);}
        else{
            s54.setText("");
            s54.setPadding(dp11,0,dp27,0);}

        final TextView s55 = (TextView)findViewById(R.id.s55);
        s55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s55.setTextColor(Color.BLUE);
                }else {s55.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s55.setId(hehe);
            }
        });
        if (puslespil.getField(54)!=0){
            s55.setText(Integer.toString(puslespil.getField(54)));
            s55.setClickable(false);}
        else{
            s55.setText("");
            s55.setPadding(dp11,0,dp27,0);}

        final TextView s56 = (TextView)findViewById(R.id.s56);
        s56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s56.setTextColor(Color.BLUE);
                }else {s56.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s56.setId(hehe);
            }
        });
        if (puslespil.getField(55)!=0){
            s56.setText(Integer.toString(puslespil.getField(55)));
            s56.setClickable(false);}
        else{
            s56.setText("");
            s56.setPadding(dp11,0,dp27,0);}

        final TextView s57 = (TextView)findViewById(R.id.s57);
        s57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s57.setTextColor(Color.BLUE);
                }else {s57.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s57.setId(hehe);
            }
        });
        if (puslespil.getField(56)!=0){
            s57.setText(Integer.toString(puslespil.getField(56)));
            s57.setClickable(false);}
        else{
            s57.setText("");
            s57.setPadding(dp11,0,dp27,0);}

        final TextView s58 = (TextView)findViewById(R.id.s58);
        s58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s58.setTextColor(Color.BLUE);
                }else {s58.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s58.setId(hehe);
            }
        });
        if (puslespil.getField(57)!=0){
            s58.setText(Integer.toString(puslespil.getField(57)));
            s58.setClickable(false);}
        else{
            s58.setText("");
            s58.setPadding(dp11,0,dp27,0);}

        final TextView s59 = (TextView)findViewById(R.id.s59);
        s59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s59.setTextColor(Color.BLUE);
                }else {s59.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s59.setId(hehe);
            }
        });
        if (puslespil.getField(58)!=0){
            s59.setText(Integer.toString(puslespil.getField(58)));
            s59.setClickable(false);}
        else{
            s59.setText("");
            s59.setPadding(dp11,0,dp27,0);}

        final TextView s60 = (TextView)findViewById(R.id.s60);
        s60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s60.setTextColor(Color.BLUE);
                }else {s60.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s60.setId(hehe);
            }
        });
        if (puslespil.getField(59)!=0){
            s60.setText(Integer.toString(puslespil.getField(59)));
            s60.setClickable(false);}
        else{
            s60.setText("");
            s60.setPadding(dp11,0,dp27,0);}

        final TextView s61 = (TextView)findViewById(R.id.s61);
        s61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s61.setTextColor(Color.BLUE);
                }else {s61.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s61.setId(hehe);
            }
        });
        if (puslespil.getField(60)!=0){
            s61.setText(Integer.toString(puslespil.getField(60)));
            s61.setClickable(false);}
        else{
            s61.setText("");
            s61.setPadding(dp11,0,dp27,0);}

        final TextView s62 = (TextView)findViewById(R.id.s62);
        s62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s62.setTextColor(Color.BLUE);
                }else {s62.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s62.setId(hehe);
            }
        });
        if (puslespil.getField(61)!=0){
            s62.setText(Integer.toString(puslespil.getField(61)));
            s62.setClickable(false);}
        else{
            s62.setText("");
            s62.setPadding(dp11,0,dp27,0);}

        final TextView s63 = (TextView)findViewById(R.id.s63);
        s63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s63.setTextColor(Color.BLUE);
                }else {s63.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s63.setId(hehe);
            }
        });
        if (puslespil.getField(62)!=0){
            s63.setText(Integer.toString(puslespil.getField(62)));
            s63.setClickable(false);}
        else{
            s63.setText("");
            s63.setPadding(dp11,0,dp27,0);}

        final TextView s64 = (TextView)findViewById(R.id.s64);
        s64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s64.setTextColor(Color.BLUE);
                }else {s64.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s64.setId(hehe);
            }
        });
        if (puslespil.getField(63)!=0){
            s64.setText(Integer.toString(puslespil.getField(63)));
            s64.setClickable(false);}
        else{
            s64.setText("");
            s64.setPadding(dp11,0,dp27,0);}

        final TextView s65 = (TextView)findViewById(R.id.s65);
        s65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s65.setTextColor(Color.BLUE);
                }else {s65.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s65.setId(hehe);
            }
        });
        if (puslespil.getField(64)!=0){
            s65.setText(Integer.toString(puslespil.getField(64)));
            s65.setClickable(false);}
        else{
            s65.setText("");
            s65.setPadding(dp11,0,dp27,0);}

        final TextView s66 = (TextView)findViewById(R.id.s66);
        s66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s66.setTextColor(Color.BLUE);
                }else {s66.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s66.setId(hehe);
            }
        });
        if (puslespil.getField(65)!=0){
            s66.setText(Integer.toString(puslespil.getField(65)));
            s66.setClickable(false);}
        else{
            s66.setText("");
            s66.setPadding(dp11,0,dp27,0);}

        final TextView s67 = (TextView)findViewById(R.id.s67);
        s67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s67.setTextColor(Color.BLUE);
                }else {s67.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s67.setId(hehe);
            }
        });
        if (puslespil.getField(66)!=0){
            s67.setText(Integer.toString(puslespil.getField(66)));
            s67.setClickable(false);}
        else{
            s67.setText("");
            s67.setPadding(dp11,0,dp27,0);}

        final TextView s68 = (TextView)findViewById(R.id.s68);
        s68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s68.setTextColor(Color.BLUE);
                }else {s68.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s68.setId(hehe);
            }
        });
        if (puslespil.getField(67)!=0){
            s68.setText(Integer.toString(puslespil.getField(67)));
            s68.setClickable(false);}
        else{
            s68.setText("");
            s68.setPadding(dp11,0,dp27,0);}

        final TextView s69 = (TextView)findViewById(R.id.s69);
        s69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s69.setTextColor(Color.BLUE);
                }else {s69.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s69.setId(hehe);
            }
        });
        if (puslespil.getField(68)!=0){
            s69.setText(Integer.toString(puslespil.getField(68)));
            s69.setClickable(false);}
        else{
            s69.setText("");
            s69.setPadding(dp11,0,dp27,0);}

        final TextView s70 = (TextView)findViewById(R.id.s70);
        s70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s70.setTextColor(Color.BLUE);
                }else {s70.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s70.setId(hehe);
            }
        });
        if (puslespil.getField(69)!=0){
            s70.setText(Integer.toString(puslespil.getField(69)));
            s70.setClickable(false);}
        else{
            s70.setText("");
            s70.setPadding(dp11,0,dp27,0);}

        final TextView s71 = (TextView)findViewById(R.id.s71);
        s71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s71.setTextColor(Color.BLUE);
                }else {s71.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s71.setId(hehe);
            }
        });
        if (puslespil.getField(70)!=0){
            s71.setText(Integer.toString(puslespil.getField(70)));
            s71.setClickable(false);}
        else{
            s71.setText("");
            s71.setPadding(dp11,0,dp27,0);}

        final TextView s72 = (TextView)findViewById(R.id.s72);
        s72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s72.setTextColor(Color.BLUE);
                }else {s72.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s72.setId(hehe);
            }
        });
        if (puslespil.getField(71)!=0){
            s72.setText(Integer.toString(puslespil.getField(71)));
            s72.setClickable(false);}
        else{
            s72.setText("");
            s72.setPadding(dp11,0,dp27,0);}

        final TextView s73 = (TextView)findViewById(R.id.s73);
        s73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s73.setTextColor(Color.BLUE);
                }else {s73.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s73.setId(hehe);
            }
        });
        if (puslespil.getField(72)!=0){
            s73.setText(Integer.toString(puslespil.getField(72)));
            s73.setClickable(false);}
        else{
            s73.setText("");
            s73.setPadding(dp11,0,dp27,0);}

        final TextView s74 = (TextView)findViewById(R.id.s74);
        s74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s74.setTextColor(Color.BLUE);
                }else {s74.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s74.setId(hehe);
            }
        });
        if (puslespil.getField(73)!=0){
            s74.setText(Integer.toString(puslespil.getField(73)));
            s74.setClickable(false);}
        else{
            s74.setText("");
            s74.setPadding(dp11,0,dp27,0);}

        final TextView s75 = (TextView)findViewById(R.id.s75);
        s75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s75.setTextColor(Color.BLUE);
                }else {s75.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s75.setId(hehe);
            }
        });
        if (puslespil.getField(74)!=0){
            s75.setText(Integer.toString(puslespil.getField(74)));
            s75.setClickable(false);}
        else{
            s75.setText("");
            s75.setPadding(dp11,0,dp27,0);}

        final TextView s76 = (TextView)findViewById(R.id.s76);
        s76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s76.setTextColor(Color.BLUE);
                }else {s76.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s76.setId(hehe);
            }
        });
        if (puslespil.getField(75)!=0){
            s76.setText(Integer.toString(puslespil.getField(75)));
            s76.setClickable(false);}
        else{
            s76.setText("");
            s76.setPadding(dp11,0,dp27,0);}

        final TextView s77 = (TextView)findViewById(R.id.s77);
        s77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s77.setTextColor(Color.BLUE);
                }else {s77.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s77.setId(hehe);
            }
        });
        if (puslespil.getField(76)!=0){
            s77.setText(Integer.toString(puslespil.getField(76)));
            s77.setClickable(false);}
        else{
            s77.setText("");
            s77.setPadding(dp11,0,dp27,0);}

        final TextView s78 = (TextView)findViewById(R.id.s78);
        s78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s78.setTextColor(Color.BLUE);
                }else {s78.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s78.setId(hehe);
            }
        });
        if (puslespil.getField(77)!=0){
            s78.setText(Integer.toString(puslespil.getField(77)));
            s78.setClickable(false);}
        else{
            s78.setText("");
            s78.setPadding(dp11,0,dp27,0);}

        final TextView s79 = (TextView)findViewById(R.id.s79);
        s79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s79.setTextColor(Color.BLUE);
                }else {s79.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s79.setId(hehe);
            }
        });
        if (puslespil.getField(78)!=0){
            s79.setText(Integer.toString(puslespil.getField(78)));
            s79.setClickable(false);}
        else{
            s79.setText("");
            s79.setPadding(dp11,0,dp27,0);}

        final TextView s80 = (TextView)findViewById(R.id.s80);
        s80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s80.setTextColor(Color.BLUE);
                }else {s80.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s80.setId(hehe);
            }
        });
        if (puslespil.getField(79)!=0){
            s80.setText(Integer.toString(puslespil.getField(79)));
            s80.setClickable(false);}
        else{
            s80.setText("");
            s80.setPadding(dp11,0,dp27,0);}

        final TextView s81 = (TextView)findViewById(R.id.s81);
        s81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(hehe!=0){
                    TextView xkd = (TextView) findViewById(hehe);
                    xkd.setTextColor(Color.GRAY);
                    s81.setTextColor(Color.BLUE);
                }else {s81.setTextColor(Color.BLUE);}
                hehe= View.generateViewId();
                s81.setId(hehe);
            }
        });
        if (puslespil.getField(80)!=0){
            s81.setText(Integer.toString(puslespil.getField(80)));
            s81.setClickable(false);}
        else{
            s81.setText("");
            s81.setPadding(dp11,0,dp27,0);}

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
                xkd.setPadding(dp11,0,dp27,0);
                xkd.setText(slett);

            }
        });

    }

}
