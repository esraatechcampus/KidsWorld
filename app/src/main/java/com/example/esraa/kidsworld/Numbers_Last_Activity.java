package com.example.esraa.kidsworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Numbers_Last_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers__last_);
    }
    public void goToMenu(View view){
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }

    public void tryAgain(View view) {
        Intent intent = new Intent(this,Numbers.class);
        startActivity(intent);
    }
}


