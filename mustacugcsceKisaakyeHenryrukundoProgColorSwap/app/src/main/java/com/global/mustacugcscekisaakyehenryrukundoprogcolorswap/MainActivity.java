package com.global.mustacugcscekisaakyehenryrukundoprogcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        LinearLayout llMain = findViewById(R.id.rlMain);

        TextView textView = new TextView(this);
        textView.setText("Tap to change color");
        textView.setTextSize(30);
 

        // Create Button Dynamically
        Button btnShow = new Button(this);
        btnShow.setText(R.string.show_text);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );

        textView.setLayoutParams(params);
        btnShow.setLayoutParams(params);


        btnShow.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                float red = rand.nextFloat();
                float blue= rand.nextFloat();
                float green = rand.nextFloat();
                textView.setText("r"+String.valueOf(red)+"        \ng"+String.valueOf(green)+"        \nb"+String.valueOf(blue));
                textView.setTextColor(Color.rgb(red,green,blue));
//              broadcast intent
                String message=String.valueOf(red)+","+String.valueOf(green)+","+String.valueOf(blue);
                Intent intent = new Intent();
                intent.setAction("com.global.mustacugcscekisaakyehenryrukundoprogcolorswap");
                intent.putExtra("message",message);
                sendBroadcast(intent);
            }
        });

        llMain.addView(textView);
        // Add Button to LinearLayout
        if (llMain != null) {
            llMain.addView(btnShow);
        }

    }
}