package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class FirstActivity extends AppCompatActivity {

    TextView txtvwAge;
    EditText edtName, edtYear;
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        txtvwAge = (TextView) findViewById(R.id.txtvwAge);
        edtName = (EditText) findViewById(R.id.edtName);
        edtYear = (EditText) findViewById(R.id.edtYear);
    }

    public void fnGreet(View view) {
        Calendar c = new GregorianCalendar();

        int year = c.get(Calendar.YEAR);
        String name = edtName.getText().toString();
        String age = edtYear.getText().toString();
        int ageNow = year - Integer.valueOf(age);
        txtvwAge.setText("Hello and Welcome " +  name + "---- You are " + ageNow + " years old.");

    }

    public void fnThreadActivity(View view) {
        Intent intent = new Intent(this, ThreadedActivity.class);
        String strMsg = ((EditText) findViewById(R.id.edtName)).getText().toString();
        intent.putExtra("varStr1", strMsg);
        startActivity(intent);

    }

    public void goThreadActivity(View view){
        startActivity(new Intent(this, ThreadedActivity.class));
    }
}