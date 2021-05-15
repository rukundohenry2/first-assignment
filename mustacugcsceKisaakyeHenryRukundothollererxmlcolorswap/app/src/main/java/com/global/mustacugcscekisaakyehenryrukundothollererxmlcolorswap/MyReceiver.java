package com.global.mustacugcscekisaakyehenryrukundothollererxmlcolorswap;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;




import androidx.constraintlayout.widget.ConstraintLayout;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String broadcastedMessage=intent.getStringExtra("message");
        if(intent.getAction().equals("com.global.mustacugcscekisaakyehenryrukundoprogcolorswap")){
            Toast.makeText(context,broadcastedMessage+"is the new color code",Toast.LENGTH_LONG).show();
        }

    }
}
