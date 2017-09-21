package com.httproktobd.roktobd;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ActivityRegistration extends AppCompatActivity {
    private RadioButton maleRB,femaleRB;
    private String male,female;
    public Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        fragment = new FragmenBloodGroup();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragmentContainer,fragment);
        ft.addToBackStack(null);
        ft.commit();


        // ok

        // start find view
            maleRB      = (RadioButton) findViewById(R.id.radioMale);
            femaleRB    = (RadioButton) findViewById(R.id.radioFemale);
        //end find view


    }

    public void detectBloodGroup(View view) {
        Toast.makeText(this, "Hi", Toast.LENGTH_SHORT).show();
        fragment = new FragmentAddressChoose();
        configFragment(fragment);
    }

    public void onClickGender(View view) {
            male = maleRB.getText().toString();
            female = femaleRB.getText().toString();
            Toast.makeText(this, male, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, female, Toast.LENGTH_SHORT).show();
    }
    public void pickAddress (View view){
        fragment = new FragmentRegForm();
        configFragment(fragment);


    }
    public void configFragment(Fragment fragment){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragmentContainer,fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
    public void verification (View view){
        fragment = new FragmentVerification();
        configFragment(fragment);


    }




}
