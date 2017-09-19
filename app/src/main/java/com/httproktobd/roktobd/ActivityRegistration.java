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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        Fragment bloodgroupFlagment = new FragmenBloodGroup();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragmentContainer,bloodgroupFlagment);
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
        Fragment fragmentRegForm = new FragmentRegForm();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragmentContainer,fragmentRegForm);
        ft.addToBackStack(null);
        ft.commit();
    }

    public void onClickGender(View view) {
            male = maleRB.getText().toString();
            female = femaleRB.getText().toString();
            Toast.makeText(this, male, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, female, Toast.LENGTH_SHORT).show();
    }




}
