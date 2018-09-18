package com.example.ahmad.myapplication;

        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class Constraint extends AppCompatActivity {

    private Button button4;
    private CheckBox checkBox2;
    private TextView eText;
    private TextView pText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);

        button4 = (Button) findViewById(R.id.button4);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        eText = (TextView) findViewById(R.id.editText3);
        pText = (TextView) findViewById(R.id.editText2);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBox2.isChecked()){
                    Toast.makeText(Constraint.this,"Please Accept Terms and Conditions",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Constraint.this,"Email:" + eText.getText().toString() + "  Password:" + pText.getText().toString(),Toast.LENGTH_SHORT).show();
                }
            }

        });

    }
}
