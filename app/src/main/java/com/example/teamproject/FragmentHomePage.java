package com.example.teamproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentHomePage extends Fragment{

    public FragmentHomePage(){
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_page,container,false);

        LinearLayout alnwick = view.findViewById(R.id.Alnwick_Castle_option);
        alnwick.setOnClickListener(view1 -> {
            Intent intent1 = new Intent(getActivity(),AlnwickCastlePage.class);
            startActivity(intent1);
        });

        LinearLayout auckland = view.findViewById(R.id.Auckland_Castle_option);
        auckland.setOnClickListener(view1 -> {
            Intent intent2 = new Intent(getActivity(),AucklandCastlePage.class);
            startActivity(intent2);
        });

        LinearLayout bamburgh = view.findViewById(R.id.Bamburgh_Castle_option);
        bamburgh.setOnClickListener(view1 -> {
            Intent intent3 = new Intent(getActivity(),BamburghCastlePage.class);
            startActivity(intent3);
        });


        LinearLayout barnard = view.findViewById(R.id.Barnard_Castle_option);
        barnard.setOnClickListener(view1 -> {
            Intent intent4 = new Intent(getActivity(),BarnardCastlePage.class);
            startActivity(intent4);
        });
        return view;
    }




}
