package com.example.intensproj;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    static EditText editText;
    static EditText editText2;
    TextView textView, textView2;
    Button button;

    public static final String Number1 = "no1";
    public static final String Number2 = "no2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);

        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String number1 = editText.getText().toString();
                String number2 = editText2.getText().toString();

                if (number1.equals("")||number2.equals("") ) {
                    Toast.makeText(getApplicationContext(), "Fields are empty!", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(getApplicationContext(), "Message sending......", Toast.LENGTH_SHORT).show();




                    Intent intent;
                    intent = new Intent(getBaseContext(), SecondActivity.class);
                    intent.putExtra(Number1, number1);
                    intent.putExtra(Number2, number2);
                    startActivity(intent);


                }
            }
        });

    }
}