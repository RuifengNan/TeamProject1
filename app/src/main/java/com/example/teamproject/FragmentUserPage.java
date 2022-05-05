package com.example.teamproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentUserPage extends Fragment {


    public FragmentUserPage(){
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_page,container,false);

        LinearLayout settingPage = view.findViewById(R.id.setting);
        settingPage.setOnClickListener(view1 -> {
            Intent intent = new Intent(getActivity(),SettingPage.class);
            startActivity(intent);
        });

        LinearLayout helpAndSup = view.findViewById(R.id.help_and_support);
        helpAndSup.setOnClickListener(view2 -> {
            Intent intent = new Intent(getActivity(),HelpAndSupPage.class);
            startActivity(intent);
        });

        LinearLayout feedBack = view.findViewById(R.id.feedback);
        feedBack.setOnClickListener(view3 -> {
            Intent intent = new Intent(getActivity(),FeedbackPage.class);
            startActivity(intent);
        });

        Button signOut = view.findViewById(R.id.sign_out);
        signOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setIcon(null);
                builder.setTitle("Confirm");
                builder.setMessage("Are you sure to sign out?");

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getContext(),"exit successful",Toast.LENGTH_SHORT).show();
                        getActivity().finish();
                    }
                });
            }
        });


        return view;
    }



}
