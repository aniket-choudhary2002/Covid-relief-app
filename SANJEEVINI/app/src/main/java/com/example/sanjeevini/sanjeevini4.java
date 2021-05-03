package com.example.sanjeevini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.sanjeevini.ui.EXIT;

public class sanjeevini4 extends AppCompatActivity {
    private Button Plasma;
    private Button Oxygcyl;
    private Button Hopsbed;
    private Button Remdi;
    private Button other;
    private Button Exit;
    int v1,v2,v3,v4,v5,v6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanjeevini4);

        Plasma = (Button) findViewById(R.id.button4);
        Plasma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1++;
                Intent in = new Intent(sanjeevini4.this, Sanjeevini3.class);
                startActivity(in);
            }
        });

        Oxygcyl = (Button) findViewById(R.id.button8);
        Oxygcyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2++;
                Intent in = new Intent(sanjeevini4.this, Sanjeevini3.class);
                startActivity(in);
            }
        });

        Hopsbed = (Button) findViewById(R.id.button8);
        Hopsbed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v3++;
                Intent in = new Intent(sanjeevini4.this, Sanjeevini3.class);
                startActivity(in);
            }
        });

        Remdi = (Button) findViewById(R.id.button8);
        Remdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v4++;
                Intent in = new Intent(sanjeevini4.this, Sanjeevini3.class);
                startActivity(in);
            }
        });

        other = (Button) findViewById(R.id.button8);
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v5++;
                Intent in = new Intent(sanjeevini4.this, others.class);
                startActivity(in);
            }
        });

        Oxygcyl = (Button) findViewById(R.id.button8);
        Oxygcyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v6++;
                Intent in = new Intent(sanjeevini4.this, Sanjeevini3.class);
                startActivity(in);
            }
        });

        Exit = (Button) findViewById(R.id.button8);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(sanjeevini4.this, EXIT.class);
                startActivity(in);
            }
        });

    }

}
