package com.example.sanjeevini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sanjeevini.ui.EXIT;

public class Sanjeevini3 extends AppCompatActivity {

    private Button Mumbai;
    private Button Indore;
    private Button Bengluru;
    private Button Surat;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanjeevini3);

    Mumbai= (Button) findViewById(R.id.button3);
    Mumbai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Sanjeevini3.this,SANJEEVINI5.class);
                startActivity(in);
            }
        });
    Indore=(Button) findViewById(R.id.button5);
    Indore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Sanjeevini3.this,sanjeevini6.class);
                startActivity(in);
            }
        });
    Bengluru=(Button) findViewById(R.id.button7);
    Bengluru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Sanjeevini3.this,sajeevini7.class);
                startActivity(in);
            }
        });
    Surat=(Button) findViewById(R.id.button6);
    Surat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Sanjeevini3.this,Sanjeevini8.class);
                startActivity(in);
            }
        });
        exit = (Button) findViewById(R.id.button8);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Sanjeevini3.this, EXIT.class);
                startActivity(in);
            }
        });
    }

}