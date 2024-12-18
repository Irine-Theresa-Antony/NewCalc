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

public class Mul extends AppCompatActivity {

    Button m1,m2;
    EditText md1,md2;
    String e1,e2,e3;
    Integer r1,r2,r3;
    TextView r5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mul);
        m1=(Button) findViewById(R.id.mb1);
        m2=(Button) findViewById(R.id.mb2);
        md1=(EditText) findViewById(R.id.me1);
        md2=(EditText) findViewById(R.id.me2);
        r5=(TextView) findViewById(R.id.t3);

        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mob1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mob1);
            }
        });

        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1=md1.getText().toString();
                e2=md2.getText().toString();
                r1=Integer.parseInt(e1);
                r2=Integer.parseInt(e2);
                r3=r1*r2;
                e3=String.valueOf(r3);
                Toast.makeText(getApplicationContext(),e3,Toast.LENGTH_LONG).show();
                r5.setText(e3);
            }
        });
    }
}