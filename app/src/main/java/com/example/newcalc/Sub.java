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

public class Sub extends AppCompatActivity {

    Button s1,s2;
    EditText sd1,sd2;
    String q1,q2,q3;
    Integer w1,w2,w3;
    TextView r2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);

        s1=(Button) findViewById(R.id.sb1);
        s2=(Button) findViewById(R.id.sb2);
        sd1=(EditText) findViewById(R.id.se1);
        sd2=(EditText) findViewById(R.id.se2);
        r2=(TextView) findViewById(R.id.t2);

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sob1=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(sob1);
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                q1=sd1.getText().toString();
                q2=sd2.getText().toString();
                w1=Integer.parseInt(q1);
                w2=Integer.parseInt(q2);
                w3=w1-w2;
                q3=String.valueOf(w3);
                Toast.makeText(getApplicationContext(),q3,Toast.LENGTH_LONG).show();
                r2.setText(q3);
            }
        });

    }
}