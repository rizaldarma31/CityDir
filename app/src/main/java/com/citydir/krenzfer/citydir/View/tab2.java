package com.citydir.krenzfer.citydir.View;

/**
 * Created by Jupe Taek on 6/8/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.citydir.krenzfer.citydir.R;

/**
 * Created by Belal on 2/3/2016.
 */

//Our class extending fragment
public class tab2 extends Fragment {

    Button addButton;
    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        View v= inflater.inflate(R.layout.tab2, container, false);
        addButton = (Button)v.findViewById(R.id.button4);
        addButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent in=new Intent(getActivity(),MapsActivity.class);
                startActivity(in);

            }
        });
        return v;
    }
}
