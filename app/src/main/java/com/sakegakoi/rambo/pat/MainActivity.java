package com.sakegakoi.rambo.pat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void newGame(View view) {
        intent = new Intent(this, Newgame.class);
        startActivity(intent);
    }

    public void highScore(View view) {
        intent = new Intent(this, HighScore.class);
        startActivity(intent);
    }
}
