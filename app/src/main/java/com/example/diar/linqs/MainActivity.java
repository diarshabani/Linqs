package com.example.diar.linqs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent i = new Intent(this, Create2.class);
        final Intent j= new Intent(this, JoinIntial.class);
        Button b1=(Button) findViewById(R.id.Cre);
        Button b2=(Button) findViewById(R.id.join);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                startActivity(j);
            }
        });
    }
    public void alternate(View view)
    {

    }
}
