package com.example.aashutoshsingh.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mStoryIndex = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //declaring and assigning the value to the button & textView field.
        final Button mbtn1 = findViewById(R.id.btn1);
        final Button mbtn2 = findViewById(R.id.btn2);
        final TextView mtxt = findViewById(R.id.txt1);
        //click on button-1
        mbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    //we can use it for Logcat...
                    Log.d("msg", "btn1 pressed");
                    //alert on mobile on pressing the button...
                    Toast.makeText(getApplicationContext(), "btn1 is pressed", Toast.LENGTH_SHORT).show();

                    //so now on press of button 1 we will see t3 story
                    mtxt.setText(R.string.T3_story);
                    //we have to update the values of buttons as well..
                    mbtn1.setText(R.string.T3_ans1);
                    mbtn2.setText(R.string.T3_ans2);
                    //update..it now with the index...
                    mStoryIndex = 3;
                } else if (mStoryIndex == 3) {
                    mtxt.setText(R.string.T6_End);
                    mbtn1.setVisibility(View.GONE);
                    mbtn2.setVisibility(View.GONE);
                } else if (mStoryIndex == 2) {
                    mtxt.setText(R.string.T2_story);
                    mbtn1.setText(R.string.T3_ans1);
                    mbtn2.setText(R.string.T3_ans2);
                    mStoryIndex = 4;
                } else if (mStoryIndex == 4) {
                    mtxt.setText(R.string.T6_End);
                    mbtn1.setVisibility(View.GONE);
                    mbtn2.setVisibility(View.GONE);
                }
            }
        });
        //click on button-2
        mbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mStoryIndex == 1) {
                    //we can use it for Logcat...
                    Log.d("msg", "btn2 pressed");
                    //alert on mobile on pressing the button...
                    Toast.makeText(getApplicationContext(), "btn2 is pressed", Toast.LENGTH_SHORT).show();
                    //so now on press of button 1 we will see t4 story
                    mtxt.setText(R.string.T4_story);
                    //we have to update the values of buttons as well..
                    mbtn1.setText(R.string.T4_ans1);
                    mbtn2.setText(R.string.T4_ans2);

                    //checking the story view.. we need to use if-else...now go up and put if-else
                    //update if part of the statement...
                    mStoryIndex = 2;
                } else if (mStoryIndex == 2) {
                    mtxt.setText(R.string.T5_End);
                    mbtn1.setVisibility(View.GONE);
                    mbtn2.setVisibility(View.GONE);
                } else if (mStoryIndex == 3) {
                    mtxt.setText(R.string.T7_End);
                    mbtn1.setVisibility(View.GONE);
                    mbtn2.setVisibility(View.GONE);
                } else if (mStoryIndex == 4) {
                    mtxt.setText(R.string.T8_End);
                    mbtn1.setVisibility(View.GONE);
                    mbtn2.setVisibility(View.GONE);
                }
            }
        });
    }
}
