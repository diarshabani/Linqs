package com.example.diar.linqs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

    public class MorePeeps extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_more_peeps);
            final Intent raf= new Intent(this, AdminFinal.class);//make the class
            Button Finalzz = (Button) findViewById(R.id.jew);
            Finalzz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(raf);
                }


            });
        }
    }
