package com.httproktobd.roktobd;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        /*FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft  =   fm.beginTransaction();
        FragmenBloodGroup fragmenBloodGroup = new FragmenBloodGroup();
        ft.replace(R.id.fragment_reg_blood_group,fragmenBloodGroup);
        ft.commit();*/
    }

    public void changeFragment(View view) {

    }
}
