package com.example.teamproject;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainPageAfterLogin extends AppCompatActivity implements View.OnClickListener {

    private Fragment fragmentHomePage;
    private Fragment fragmentCalendarPage;
    private Fragment fragmentUserPage;

    private TextView homeText;
    private TextView calendarText;
    private TextView userText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page_after_login);
        initView();
        setFragment(0);
    }

    private void initView(){
        homeText = findViewById(R.id.index_menu_Home_text);
        homeText.setOnClickListener(this);

        calendarText = findViewById(R.id.index_menu_Calendar_text);
        calendarText.setOnClickListener(this);

        userText = findViewById(R.id.index_menu_User_text);
        userText.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id){
            case R.id.index_menu_Home_text:
                setFragment(0);
                break;
            case R.id.index_menu_Calendar_text:
                setFragment(1);
                break;
            case R.id.index_menu_User_text:
                setFragment(2);
                break;
            default:
                break;
        }
    }

    public void setFragment(int index){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        hideFragment(fragmentTransaction);
        switch (index){
            case 0:
                homeText.setTextColor(getResources().getColor(R.color.color_text_pressed));
                homeText.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.home_blue,0,0);
                if(fragmentHomePage == null){
                    fragmentHomePage = new FragmentHomePage();
                    fragmentTransaction.add(R.id.fragment_container,fragmentHomePage,"home_fragment");
                }else{
                    fragmentTransaction.show(fragmentHomePage);
                }
                break;

            case 1:
                calendarText.setTextColor(getResources().getColor(R.color.color_text_pressed));
                calendarText.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.calendar_blue,0,0);
                if(fragmentCalendarPage == null){
                    fragmentCalendarPage = new FragmentCalendarPage();
                    fragmentTransaction.add(R.id.fragment_container,fragmentCalendarPage,"calendar_fragment");
                }else{
                    fragmentTransaction.show(fragmentCalendarPage);
                }
                break;

            case 2:
                userText.setTextColor(getResources().getColor(R.color.color_text_pressed));
                userText.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.user_blue,0,0);
                if(fragmentUserPage == null){
                    fragmentUserPage = new FragmentUserPage();
                    fragmentTransaction.add(R.id.fragment_container,fragmentUserPage,"user_fragment");
                }else{
                    fragmentTransaction.show(fragmentUserPage);
                }
                break;

            default:
                break;
        }
        fragmentTransaction.commit();
    }

    public void hideFragment(FragmentTransaction fragmentTransaction){
        if(fragmentHomePage!=null){
            fragmentTransaction.hide(fragmentHomePage);
            homeText.setTextColor(getResources().getColor(R.color.color_text_hide));
            homeText.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.home_gray,0,0);
        }
        if(fragmentCalendarPage!=null){
            fragmentTransaction.hide(fragmentCalendarPage);
            calendarText.setTextColor(getResources().getColor(R.color.color_text_hide));
            calendarText.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.calendar_gray,0,0);
        }
        if(fragmentUserPage!=null){
            fragmentTransaction.hide(fragmentUserPage);
            userText.setTextColor(getResources().getColor(R.color.color_text_hide));
            userText.setCompoundDrawablesWithIntrinsicBounds(0,R.drawable.user_gray,0,0);
        }
    }

}
