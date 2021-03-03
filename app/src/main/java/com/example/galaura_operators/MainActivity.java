package com.example.galaura_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.galaura_operators.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayTxt);


        int birthYear = 2002;
        int birthMonth = 05;
        int birthDay = 12;

        int currentYear = 2021;
        int currentMonth = 1;
        int currentDay = 28;

        int ageInYears, ageInMonths, ageInDays;

        if (birthMonth > currentMonth) {
            birthMonth += 12;
            currentYear -= 1;
        }

        if (birthDay > currentDay) {
            birthMonth += 12;
            currentYear -= 1;
        }

        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("My precise age is \n" +
                String.valueOf(ageInYears) +
                " Years,\n" +
                String.valueOf(ageInMonths) +
                " Months,\n" +
                String.valueOf(ageInDays) +
                " Days.");
    }
}

