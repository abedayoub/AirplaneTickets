package com.example.airplanetickets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numOfPass, totalLugg;
    RadioButton Bus, Eco;
    Button CalcBtn;
    double  maxweight;
    String type;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numOfPass = (EditText)findViewById(R.id.numOfPassengers);
        totalLugg = (EditText)findViewById(R.id.LuggageWeight);

        if(Bus.isSelected()){
            type="Business";
            maxweight=40;
        }
        else if(Eco.isSelected()){
            type="Economy";
            maxweight=30;
        }
        else{
            Toast.makeText(this,"Select a type" , Toast.LENGTH_LONG).show();
        }
    }

    public void onClick(View view){


        Intent i = new Intent(this, DisplayCost.class);
        i.putExtra("numOfPass", numOfPass.getText());
        i.putExtra("Weight", totalLugg.getText());
        i.putExtra("type",type);

        CalculateCost c = new CalculateCost(numOfPass.getText().toString(),totalLugg.getText().toString(),type);


    }

    public double calculateCost(double numPass, double Luggage, String type){
        numPass= Double.parseDouble(numOfPass.getText().toString());
        Luggage = Double.parseDouble(totalLugg.getText().toString());
        type= this.type;

        if(maxweight-Luggage>0){
            calc
        }
    }
}
