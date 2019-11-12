package com.example.employeeapp;

public class Employee
{
    String firstName;
    String lastName;
    int age;
    int weight;
    int height;

    public Employee(String firstName, String lastName, int age, int height, int weight)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
}
