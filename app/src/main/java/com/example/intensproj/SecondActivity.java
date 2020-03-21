package com.example.intensproj;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.intensproj.FirstActivity.*;

public class SecondActivity extends AppCompatActivity {

    TextView textView5 ,textView6,textView7;
    Button button2 , button3 ,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        textView5 =(TextView)findViewById(R.id.textView5);
        textView6 =(TextView)findViewById(R.id.textView6);
        textView7 =(TextView)findViewById(R.id.textView7);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);

        Intent intent = getIntent();

        final String n1= intent.getStringExtra(Number1);
        final String n2= intent.getStringExtra(Number2);

        textView5.setText(n1);
        textView7.setText(n2);

        final int number1 = Integer.parseInt(n1);
        final int number2 = Integer.parseInt(n2);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String val = String.valueOf(number1+number2);

                textView6.setText(val);
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String val = String.valueOf(number1-number2);

                textView6.setText(val);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String val = String.valueOf(number1*number2);

                textView6.setText(val);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String val = String.valueOf(number1/number2);

                textView6.setText(val);
            }
        });


    }


}
