package com.example.diar.linqs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class Create2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create2);
       // final Intent addMore= new Intent(this, MorePeeps.class);
        final Intent finalpage=new Intent(this, AdminFinal.class);
        //Button add=(Button) findViewById(R.id.Additional);
        Button finalz=(Button)findViewById(R.id.Finalize);
        // b4.setOnClickListener(new View.OnClickListener(){
        finalz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(finalpage);
                }
        });
    }
}
