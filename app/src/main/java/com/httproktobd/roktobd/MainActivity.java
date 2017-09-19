package com.httproktobd.roktobd;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       /* TextView number = (TextView) findViewById(R.id.number);
        TelephonyManager tManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        number.setText(tManager.getLine1Number());
    */
        TextView number = (TextView) findViewById(R.id.number);
        TelephonyManager tm = (TelephonyManager)getSystemService(TELEPHONY_SERVICE);
        String num = tm.getLine1Number();
        number.setText(num);
    }

    public void linkToSignup(View view) {
        startActivity(new Intent(this,ActivityRegistration.class));
    }
}
