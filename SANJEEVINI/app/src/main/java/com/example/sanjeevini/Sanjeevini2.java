package com.example.sanjeevini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Sanjeevini2<Button> extends AppCompatActivity {

    private Button Get;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sanjeevini2);
        Get = (Button)findViewById(R.id.button2);
    }
    private void validate()
    {
        Intent intent;
        intent = new Intent(Sanjeevini2.this,Sanjeevini3.class);
    }

}