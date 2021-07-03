package com.myfirst.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView mEtFirst,mEtOne,mEtTwo,mEtThree;
    private TextView mEtFour,mEtFive,mEtSix,mEtSeven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getViewsId();
        setTextValues();
    }

    private void getViewsId(){
        mEtFirst = findViewById(R.id.etFirst);
        mEtOne = findViewById(R.id.etOne);
        mEtTwo = findViewById(R.id.etTwo);
        mEtThree = findViewById(R.id.etThree);
        mEtFour = findViewById(R.id.etFour);
        mEtFive = findViewById(R.id.etFive);
        mEtSix = findViewById(R.id.etSix);
        mEtSeven = findViewById(R.id.etSeven);
    }

    private void setTextValues() {
        mEtFirst.setText(getIntent().getStringExtra("first"));
        mEtOne.setText(getIntent().getStringExtra("one"));
        mEtTwo.setText(getIntent().getStringExtra("two"));
        mEtThree.setText(getIntent().getStringExtra("three"));
        mEtFour.setText(getIntent().getStringExtra("four"));
        mEtFive.setText(getIntent().getStringExtra("five"));
        mEtSix.setText(getIntent().getStringExtra("six"));
        mEtSeven.setText(getIntent().getStringExtra("seven"));
    }
}