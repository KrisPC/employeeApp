package com.example.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class EmployeeInfoScreen extends AppCompatActivity
{
    public EditText firstNameET, lastNameET, heightET, weightET, ageET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_info_screen);

    }
}
