package com.example.kristian.layouttilsud;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by kristian on 11/28/17.
 */

public class drawLine extends View {
    Paint paint = new Paint();
    int huskx = 150;
    int husktilx=200;


    public drawLine(Context context) {
        super(context);
    }

    public drawLine(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public drawLine(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public drawLine(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    private void normal(){
        paint.setStrokeWidth(5);
    }
    private void thick(){
        paint.setStrokeWidth(11);
    }
    @Override
    public void onDraw(Canvas canvas){
        normal();
        float hahay = 1020;
        float hahax=201;
        canvas.drawLine(hahax,40,hahax,hahay,paint);
        canvas.drawLine(hahax-100,40,hahax-100,hahay,paint);
    }
}
