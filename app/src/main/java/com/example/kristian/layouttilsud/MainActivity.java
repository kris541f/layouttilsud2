package com.example.kristian.layouttilsud;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class MainActivity extends AppCompatActivity {
    //different variables are instantiated
    int randomid;
    float faktor ;
    int dp11 ;
    int dp27;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //"faktor" is used to calculate the dp needed for when we need to set padding in the textviews
        faktor= getResources().getDisplayMetrics().density;
        //2 different dp values are needed. one for when there is no number in the textview, and the other for when there is.
        dp27= (int)(27*faktor+0.5f);
        dp11= (int) (11*faktor+0.5f);
        //The puzzle is generated
        PuzzleGenerator pg = new PuzzleGenerator();
        final Puzzle puslespil = pg.getPuzzle();
        //Textviews are inserted into a textviewarray to make it easier to access and loop through them
        final TextView[] mineviews = new TextView[81];
        for(int i=0; i<81; i++) {
            //Here we find the textviews via their ids. Each textview has the id s1,s2,s3 up until s81 (since sudoku is 9x9)
            String textviewID = "s" + (i+1);
            int resID = getResources().getIdentifier(textviewID, "id", getPackageName());
            final TextView tw = findViewById(resID);
            mineviews[i] = tw;
            //The onclicklistener is set for each textview
            tw.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    /**this if statement acts as an "selector". if the randomid hasn't gotten a value yet it will be equal to 0. Thereby the else
                    staatement will be triggered and the selected textviews textcolor will become blue as a visual indicator to the user.
                    If the randomid however already has a value, this value will correspond to a previously selected textview, which will then become
                    gray, and the newly selected textview "tw" will become blue to indicate the newly selected textview.*/
                    if(randomid!=0){
                        TextView xkd = (TextView) findViewById(randomid);
                        xkd.setTextColor(Color.GRAY);
                        tw.setTextColor(Color.BLUE);}
                    else {tw.setTextColor(Color.BLUE);}
                    //Here a new value for randomid is generated to account for the new selection of a textview
                    randomid= View.generateViewId();
                    tw.setId(randomid);
                }

            });
            /**
             After the onclicklistener is set, we check whether or not the textview should actually be clickable by checking if the puzzle has generated
             a value for the specific textview. If the puzzle has indeed generated a value, the value in puslespil.getField(i) will not be equal to 0
             which will cause the text of the given textview to be set to the specific int value assigned in "puslespil" and the textview is made "unclickable,
             since the user shouldn't be able to change the core game mechanics. if, however, the field hasn't been assigned a value in "puslespil" the textview
             is then set to an empty string and the padding is changed to accomodate the empty textview.
             */
            if (puslespil.getField(i)!=0){
                tw.setText(Integer.toString(puslespil.getField(i)));
                tw.setClickable(false);}
            else{
                tw.setText("");
                tw.setPadding(dp11,0,dp27,0);}

        }



        //Buttons 1-9 are inserted into an array in the same way the textviews were.
        final Button[] mineknapper = new Button[9];
        for (int i = 0; i <9 ; i++) {
            String buttonID = "b" + (i+1);
            int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
            Button btn = findViewById(resID);
            mineknapper[i]=btn;
            final int finalI = i+1;
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    /**
                     Here we use the randomid created when a particular textview is selected by the user to find the textview that should have its value
                     changed when the user presses the button "1". The button will then set the value for the selected textview.
                     */
                    TextView xkd = findViewById(randomid);
                    xkd.setPadding(dp11, 0, dp11, 0);
                    xkd.setText(Integer.toString(finalI));
                    /**
                     As the user presses the button to assign a new value to the selected textview, the same value must also be assigned to the
                     puzzle in the solver program. this is done by iterating through our textview array untill we find the selected textview.
                     the int variable "j" now serves as the index pointer we can pass to the "setField" method. After we set the value
                     we check whether or not the puzzle is solved. If it is solved we initiate a new activity where we pass the boardstate as a bitmap converted into a bytearray
                     */
                    for (int j = 0; j < 81; j++) {
                        if (xkd==mineviews[j]){
                            puslespil.setField(j,finalI);
                            break;
                        }
                    }
                    if (puslespil.isSolved()){
                        Intent o = new Intent(MainActivity.this, vinderactivity.class);
                        o.putExtra("Boardstate", getbitmapfromview(findViewById(R.id.mitgrid)));
                        startActivity(o);
                    }





                }
            });


        }
        //The delete button. this button isnt grouped with the other buttons since this button's function is kinda unique. It just sets the selected textview's
        //to and empty string and adds padding
        Button sletknap = findViewById(R.id.b10);
        sletknap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView xkd = (TextView)findViewById(randomid);
                xkd.setPadding(dp11,0,dp27,0);
                xkd.setText("");


            }
        });


        
    }

    /**
     This method captures the gridlayout otherwise known as the sudoku board as a bitmap, converts and then returns it as a bytearray.
     */
    public static byte[] getbitmapfromview(View view){
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();
        Bitmap bitmap = Bitmap.createBitmap(view.getDrawingCache());
        view.setDrawingCacheEnabled(false);
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG,100,stream);
        byte[] mitbytearray = stream.toByteArray();
        return mitbytearray;
    }



}
