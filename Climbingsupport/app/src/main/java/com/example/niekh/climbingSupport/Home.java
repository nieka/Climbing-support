package com.example.niekh.climbingSupport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void showGearList(View view){
        startActivity(new Intent(this,GearListActivity.class));
    }

    public void showTopList(View view){
        startActivity(new Intent(this,TopListActivity.class));
    }
}
