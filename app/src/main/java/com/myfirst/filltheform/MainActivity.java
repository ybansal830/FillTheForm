package com.myfirst.filltheform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mBtOne;
    private TextView mEtFirst,mEtOne,mEtTwo,mEtThree;
    private TextView mEtFour,mEtFive,mEtSix,mEtSeven;
    String first,one,two,three,four,five,six,seven;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViewsId();
        mBtOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getEditTextValues();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("first",first);
                intent.putExtra("one",one);
                intent.putExtra("two",two);
                intent.putExtra("three",three);
                intent.putExtra("four",four);
                intent.putExtra("five",five);
                intent.putExtra("six",six);
                intent.putExtra("seven",seven);
                startActivity(intent);
            }
        });
    }

    private void getViewsId(){
        mBtOne = findViewById(R.id.btOne);
        mEtFirst = findViewById(R.id.etFirst);
        mEtOne = findViewById(R.id.etOne);
        mEtTwo = findViewById(R.id.etTwo);
        mEtThree = findViewById(R.id.etThree);
        mEtFour = findViewById(R.id.etFour);
        mEtFive = findViewById(R.id.etFive);
        mEtSix = findViewById(R.id.etSix);
        mEtSeven = findViewById(R.id.etSeven);
    }
    private void getEditTextValues(){
        first = mEtFirst.getText().toString();
        one = mEtOne.getText().toString();
        two = mEtTwo.getText().toString();
        three = mEtThree.getText().toString();
        four = mEtFour.getText().toString();
        five = mEtFive.getText().toString();
        six = mEtSix.getText().toString();
        seven = mEtSeven.getText().toString();
    }
}