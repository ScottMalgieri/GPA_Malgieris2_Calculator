package com.aman.gpa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.*;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculateGPA(View view) {
        // SUBJECT 1
        TextInputLayout Subject1 = findViewById(R.id.subject1);
        String Subject1Value = Subject1.getEditText().getText().toString();
        // SUBJECT 2
        TextInputLayout Subject2 = findViewById(R.id.subject2);
        String Subject2Value = Subject2.getEditText().getText().toString();
        // SUBJECT 3
        TextInputLayout Subject3 = findViewById(R.id.subject3);
        String Subject3Value = Subject3.getEditText().getText().toString();
        // SUBJECT 4
        TextInputLayout Subject4 = findViewById(R.id.subject4);
        String Subject4Value = Subject4.getEditText().getText().toString();
        // SUBJECT 5
        TextInputLayout Subject5 = findViewById(R.id.subject5);
        String Subject5Value = Subject5.getEditText().getText().toString();

        if (!Subject1Value.matches("") && !Subject2Value.matches("") && !Subject3Value.matches("") && !Subject4Value.matches("") && !Subject5Value.matches("")) {
            int calc = (Integer.parseInt(Subject1Value) + Integer.parseInt(Subject2Value) + Integer.parseInt(Subject3Value) + Integer.parseInt(Subject4Value) + Integer.parseInt(Subject5Value)) / 5;
            Log.d("APP", "calculate: "+calc);
            Intent intent = new Intent(getBaseContext(), MainResult.class);
            intent.putExtra("gpa", calc);
            startActivity(intent);
            Subject1.getEditText().getText().clear();
            Subject2.getEditText().getText().clear();
            Subject3.getEditText().getText().clear();
            Subject4.getEditText().getText().clear();
            Subject5.getEditText().getText().clear();
        } else {
            Toast.makeText(getApplicationContext(),"Please enter all the subject grades",Toast.LENGTH_SHORT).show();
        }

    }
}
