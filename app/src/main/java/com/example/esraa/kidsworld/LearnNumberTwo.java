package com.example.esraa.kidsworld;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LearnNumberTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_number_two);
        final MediaPlayer TwoSound =MediaPlayer.create(this,R.raw.two);
        Button button=(Button)findViewById(R.id.two);
        button.setOnClickListener(new View.OnClickListener(){
                                      public void onClick(View view){
                                          TwoSound.start();
                                      }
                                  }
        );}
    public void menu(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
    public void next(View view) {
        Intent intent = new Intent(this,LearnNumberZero.class);
        startActivity(intent);
    }
    public void back(View view) {
        Intent intent = new Intent(this, LearnNumberOne.class);
        startActivity(intent);
    }
}
