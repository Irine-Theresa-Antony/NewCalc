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



public class Add extends AppCompatActivity {

    Button a1,a2;
    EditText ad1,ad2;
    String getnum1,getnum2,result;
    Integer num1,num2,sum;
    TextView r1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);

        a1=(Button) findViewById(R.id.ab3);
        a2=(Button) findViewById(R.id.ab4);
        ad1=(EditText) findViewById(R.id.ae1);
        ad2=(EditText) findViewById(R.id.ae2);
        r1=(TextView) findViewById(R.id.t1);

        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aob1=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(aob1);
            }
        });

        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getnum1=ad1.getText().toString();
                getnum2=ad2.getText().toString();
                num1=Integer.parseInt(getnum1);
                num2=Integer.parseInt(getnum2);
                sum=num1+num2;
                result=String.valueOf(sum);
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
                r1.setText(result);
            }
        });

    }
}