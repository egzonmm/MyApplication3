package com.example.test.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /*Button b;
    TextView tv;
    EditText et;*/

    Button getName;
    TextView name;
    EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*b = (Button) findViewById(R.id.button2);
        et = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView1);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = et.getText().toString();
                tv.setText(str);
            }
        });*/

        getName = (Button) findViewById(R.id.button2);
        inputName = (EditText) findViewById(R.id.editTextEmri);
        name = (TextView) findViewById(R.id.textViewEmri);


        getName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_name = inputName.getText().toString();
                name.setText(str_name);
            }
        });

    }
}
