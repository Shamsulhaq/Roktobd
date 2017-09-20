package com.httproktobd.roktobd;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAddressChoose extends Fragment {
    Spinner spDivision ;
    Spinner spDistrict ;
    Spinner spUpzilla;
    Button btNext;


    public FragmentAddressChoose() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_address_choose, container, false);
         spDivision = (Spinner) view.findViewById(R.id.SpDivision);
         spDistrict = (Spinner) view.findViewById(R.id.SpDistrict);
         spUpzilla = (Spinner) view.findViewById(R.id.SpUpzilla);
         btNext = (Button) view.findViewById(R.id.BtNext);


        return view;
    }

}
