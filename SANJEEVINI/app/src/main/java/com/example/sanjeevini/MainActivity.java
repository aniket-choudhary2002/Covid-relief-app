package com.example.sanjeevini;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.security.PrivateKey;

public class MainActivity<Button> extends AppCompatActivity {

    private Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Next= (Button)findViewById(R.id.button);
    }
    private void validate()
    {
        Intent intent;
        intent = new Intent(MainActivity.this,Sanjeevini2.class);
    }
}