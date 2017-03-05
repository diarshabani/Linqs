package com.example.diar.linqs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class JoinIntial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_intial);
        final Intent Correct = new Intent(this, AdminFinal.class);
        final Intent InCorrect = new Intent(this, Wrong.class);
        Button pins=(Button) findViewById(R.id.pinB);
        // b4.setOnClickListener(new View.OnClickListener(){
        pins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(( (TextView) findViewById(R.id.pin1)).equals(123456))
                {
                    startActivity(Correct);
                }
                else
                    startActivity(Correct);
            }
        });
    }
}
