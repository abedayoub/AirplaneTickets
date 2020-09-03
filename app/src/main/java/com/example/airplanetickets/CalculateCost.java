package com.example.airplanetickets;

import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class CalculateCost{
    EditText numOfPassengers, totalLug;
    RadioButton Bus,Eco;
    Button CostCalc;
    double maxweightallowed;
    double cost;
      double CalculateCost(String pass,String lug,String type) {
          double passengers = Double.parseDouble(pass.toString());
          double weight = Double.parseDouble(lug.toString());
          double typecost = 0;
          if (type == "Business") {
              typecost = 500;
              maxweightallowed = 40;

          } else if (type == "Economy") {
              typecost = 300;
              maxweightallowed = 30;
          }


          if (maxweightallowed < weight) {
              return passengers * typecost;
          }
          if (maxweightallowed > weight) {
              return (weight - maxweightallowed) * 6 * passengers;
          }

      }
}
