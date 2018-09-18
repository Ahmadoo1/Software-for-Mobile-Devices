package com.example.ahmad.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class Relative extends AppCompatActivity {

    private Button button3;
    private CheckBox checkBox3;
    private TextView eText;
    private TextView pText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);


        button3 = (Button) findViewById(R.id.button3);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        eText = (TextView) findViewById(R.id.editText5);
        pText = (TextView) findViewById(R.id.editText6);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBox3.isChecked()){
                    Toast.makeText(Relative.this,"Please Accept Terms and Conditions",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Relative.this,"Email:" + eText.getText().toString() + "  Password:" + pText.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            }

        });
    }
}
