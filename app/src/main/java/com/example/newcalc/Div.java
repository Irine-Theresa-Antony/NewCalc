package com.example.newcalc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Div extends AppCompatActivity {

    Button d1,d2;
    EditText dd1,dd2;
    String e1,e2,e3;
    Integer r1,r2,r3;
    TextView r4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_div);

        d1=(Button) findViewById(R.id.db1);
        d2=(Button) findViewById(R.id.db2);
        dd1=(EditText) findViewById(R.id.de1);
        dd2=(EditText) findViewById(R.id.de2);
        r4=(TextView) findViewById(R.id.t4);

        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dob1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(dob1);
            }
        });

        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1=dd1.getText().toString();
                e2=dd2.getText().toString();
                r1=Integer.parseInt(e1);
                r2=Integer.parseInt(e2);
                r3=r1/r2;
                e3=String.valueOf(r3);
                Toast.makeText(getApplicationContext(),e3,Toast.LENGTH_LONG).show();
                r4.setText(e3);
            }
        });

    }
}