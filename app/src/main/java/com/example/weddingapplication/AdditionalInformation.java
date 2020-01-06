package com.example.weddingapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AdditionalInformation extends AppCompatActivity
{
    private Button register_button;


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.additionalinformation_wedding);

        register_button = findViewById(R.id.register_button);
        register_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdditionalInformation.this, RegisterationInfo.class);
                startActivity(intent);
            }
        });
    }
}
