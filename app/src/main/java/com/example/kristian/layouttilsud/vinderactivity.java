package com.example.kristian.layouttilsud;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class vinderactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinderactivity);
        /**
         This is the winner activity wherein the winning boardstate is shown.
         */
        ImageView vinderview = findViewById(R.id.vinderview);
        //Here we get the extra information we passed from our other activity
        Bundle extra = getIntent().getExtras();
        byte[] mitbytearray = extra.getByteArray("Boardstate");
        //The bytearray is converted back into a bitmap and which is then shown in the imageview
        Bitmap bitmap = BitmapFactory.decodeByteArray(mitbytearray,0,mitbytearray.length);
        vinderview.setImageBitmap(bitmap);
    }
}
