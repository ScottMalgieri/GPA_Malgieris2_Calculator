package com.aman.gpa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainResult extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        int gpa = getIntent().getIntExtra("gpa",0);
        Log.d("GPA", String.valueOf(gpa));
        TextView score = (TextView) findViewById(R.id.score);
        score.setText(String.valueOf(gpa));

        RelativeLayout layout = (RelativeLayout)findViewById(R.id.scoreContainer);
        if (gpa < 60) {
            layout.setBackgroundResource(R.drawable.background_red);
        } else if (gpa > 61 && gpa < 79) {
            layout.setBackgroundResource(R.drawable.background_yellow);
        } else if (gpa > 80 && gpa < 100) {
            layout.setBackgroundResource(R.drawable.background_green);
        }
    }
    public void goBack(View view) {
        finish();
    }

}
