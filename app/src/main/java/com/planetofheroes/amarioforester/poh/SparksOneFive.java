package com.planetofheroes.amarioforester.poh;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SparksOneFive extends AppCompatActivity {
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sparks_one_five);

        View overlay = findViewById(R.id.sparksonefive);

        overlay.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN);


        backButton = (Button) findViewById(R.id.backBtnSparksOneFive);
    }

    public void backBtnClick(View v){
        this.finish();
    }

}
