package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class fourth extends AppCompatActivity {
    TextView t1;
    Button b1;










    
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        t1=(TextView) findViewById(R.id.textView4);
        b1=(Button) findViewById(R.id.button4);
        t1.setText("Your Score is "+MainActivity.score);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(fourth.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}