package com.example.galaxy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class basketactivity1 extends AppCompatActivity {
    ImageView basketballreg;
    ImageView ongoingbasketball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketactivity1);

        basketballreg= findViewById(R.id.basketballreg);
        ongoingbasketball=findViewById(R.id.ongoingbasketball);

        basketballreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(basketactivity1.this,BASKETBALLSCHEDULER.class);
                startActivity(intent);
            }
        });
        ongoingbasketball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(basketactivity1.this,ongoinggames.class);
                startActivity(intent);
            }
        });
    }

}