package com.example.android.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    //this gets the name of the class
    public static final String TAG=FunFactsActivity.class.getSimpleName();
    private  FactBook mFactBook = new FactBook();
    private  ColorWheel mColorWheel=new ColorWheel();
    //Declare View variables

    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        //Assignt the views from setcontentview

        mFactTextView= (TextView) findViewById(R.id.factTextView);
        mShowFactButton=(Button) findViewById(R.id.button);
        mRelativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact=mFactBook.getFact();
                int color=mColorWheel.getColor();



                //Update the screen with our dynamic fact
                mFactTextView.setText(fact);
                mRelativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };
        mShowFactButton.setOnClickListener(listener);

        //Toast.makeText(FunFactsActivity.this, "Yay! Our activity was created.", Toast.LENGTH_SHORT).show();

        Log.d(TAG,"We are logging from the onCreate method");
    }


}
