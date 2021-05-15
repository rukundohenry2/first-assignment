package com.global.mustacugcscekisaakyehenryrukundothollererxmlcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.IntentFilter;
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

        //intent filter and registering  receiver
        IntentFilter intentFilter;
        intentFilter=new IntentFilter("com.global.mustacugcsceMugishaFaisalprogcolorswap");
        MyReceiver myReceiver = new MyReceiver();
        registerReceiver(myReceiver,intentFilter);

        Random rand = new Random();
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
