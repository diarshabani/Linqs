package com.example.diar.linqs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Wrong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);
        final Intent Correct = new Intent(this, AdminFinal.class);
        final Intent InCorrect = new Intent(this, Wrong.class);
        Button pins=(Button) findViewById(R.id.button6);
        // b4.setOnClickListener(new View.OnClickListener(){
        pins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( ( (TextView) findViewById(R.id.pinB)).equals(123456) )
                {
                    startActivity(Correct);
                }
                else
                    startActivity(InCorrect);
            }
        });
    }
}
