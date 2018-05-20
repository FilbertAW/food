package com.example.user.food;

import android.content.res.ColorStateList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ProgressBar bar = (ProgressBar)findViewById(R.id.simpleProgressBar2);
        bar.getLayoutParams().width = 100;
        bar.invalidate();
        bar.setProgressTintList(ColorStateList.valueOf(Color.RED));
    }

}
