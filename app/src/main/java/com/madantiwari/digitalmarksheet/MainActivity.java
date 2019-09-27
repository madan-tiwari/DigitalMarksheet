package com.madantiwari.digitalmarksheet;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.madantiwari.digitalmarksheet.result.Result;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etName,etAndroid,etIOT,etAPI;
    Button btnCalculate;
    TextView tvresult;

    String name;
    double android,IOT,API,percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName=findViewById(R.id.etName);
        etAndroid=findViewById(R.id.etAndroid);
        etIOT=findViewById(R.id.etIOT);
        etAPI=findViewById(R.id.etWeb);
        btnCalculate=findViewById(R.id.btnCalculate);
        tvresult=findViewById(R.id.tvResult);
        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {


        if (TextUtils.isEmpty(etName.getText().toString()))
        {
            etName.setError("Enter Name");
            return;
        }else if(TextUtils.isEmpty(etAndroid.getText().toString()))
        {
            etAndroid.setError("Enter Android Mark");
            return;
        }
        else if(TextUtils.isEmpty(etAPI.getText().toString()))
        {
            etAPI.setError("Enter API Mark");
            return;
        }
        else if(TextUtils.isEmpty(etIOT.getText().toString()))
        {
            etIOT.setError("Enter IOT Mark");
            return;
        }


        //
        name=etName.getText().toString();
        android=Double.parseDouble(etAndroid.getText().toString());
        IOT=Double.parseDouble(etAPI.getText().toString());
        API=Double.parseDouble(etIOT.getText().toString());

        //oject of class Result
        Result res=new Result(android,IOT,API);
        percent=res.percentage();
        tvresult.append("Name: " +name + "     Percentage: " + (int) percent +"%" +"\n"+ "\n");
        //clearing edit text
        etName.setText("");
        etAndroid.setText("");
        etIOT.setText("");
        etAPI.setText("");

    }
}