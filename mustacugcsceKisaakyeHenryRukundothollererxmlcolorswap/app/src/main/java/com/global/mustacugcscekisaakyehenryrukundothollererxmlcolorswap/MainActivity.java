package com.global.mustacugcscekisaakyehenryrukundothollererxmlcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button btnShow;
    float red,blue,green;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView) findViewById(R.id.textView);
        btnShow=(Button) findViewById(R.id.btnShow);

        Random rand = new Random();
//        float r = rand.nextFloat();
//        float g = rand.nextFloat();
//        float b = rand.nextFloat();
        btnShow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            red = rand.nextFloat();
            green = rand.nextFloat();
            blue= rand.nextFloat();
            textView.setText("R"+String.valueOf(red)+"        \nG"+String.valueOf(green)+"        \nB"+String.valueOf(blue));
            textView.setTextColor(Color.rgb(red,green,blue));
            }
        });

    }
}



//super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        LinearLayout linearLayout = findViewById(R.id.rootContainer);
//        Random rand = new Random();
//        TextView textView = new TextView(this);
//        textView.setText("Tap to change color");
//        textView.setTextSize(30);
//
//        // Create Button Dynamically
//        Button btnShow = new Button(this);
//        btnShow.setText(R.string.show_text);
//
//        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        btnShow.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
//        btnShow.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
////                Toast.makeText(MainActivity.this, R.string.welcome_message, Toast.LENGTH_LONG).show();
//        float red = rand.nextFloat();
//        float blue= rand.nextFloat();
//        float green = rand.nextFloat();
//        textView.setText("r"+String.valueOf(red)+"        g"+String.valueOf(green)+"        b"+String.valueOf(blue));
//        textView.setTextColor(Color.rgb(red,green,blue));
//        }
//        });
//
//        linearLayout.addView(textView);
//        // Add Button to LinearLayout
//        if (linearLayout != null) {
//        linearLayout.addView(btnShow);
//        }