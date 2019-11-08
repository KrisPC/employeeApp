package com.example.employeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onEnterButtonPressed(View v)
    {

        TextView firstNameView = this.findViewById(R.id.firstDisplay);
        TextView lastNameView = this.findViewById(R.id.lastDisplay);
        TextView ageView = this.findViewById(R.id.ageDisplay);
        TextView heightView = this.findViewById(R.id.heightDisplay);
        TextView weightView = this.findViewById(R.id.weightDisplay);

        EditText firstEdit = this.findViewById((R.id.firstName));
        EditText lastEdit = this.findViewById((R.id.lastName));
        EditText ageEdit = this.findViewById((R.id.age));
        EditText heightEdit = this.findViewById((R.id.height));
        EditText weightEdit = this.findViewById((R.id.weight));

        String stringFirst = firstEdit.getText().toString();
        String stringLast = lastEdit.getText().toString();
        String stringAge = ageEdit.getText().toString();
        String stringHeight = heightEdit.getText().toString();
        String stringWeight = weightEdit.getText().toString();

        int numAge = Integer.parseInt((stringAge));
        int numHeight = Integer.parseInt((stringHeight));
        int numWeight = Integer.parseInt((stringWeight));



        Employee employee1 = new Employee(stringFirst, stringLast, numAge, numHeight, numWeight
        );

        firstNameView.setText("First name is: " + employee1.firstName);
        lastNameView.setText("Last name is: " + employee1.lastName);
        ageView.setText("Age is: " + employee1.age);
        heightView.setText("Height is: " + employee1.height);
        weightView.setText("Weight is: " + employee1.weight);




    }
}
