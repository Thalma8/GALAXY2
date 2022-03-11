package com.example.galaxy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FootballActivity1 extends AppCompatActivity {
    ImageView footballreg;
    ImageView ongoingfootball;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football1);
footballreg=findViewById(R.id.footballreg);
ongoingfootball=findViewById(R.id.ongoingfootball);

footballreg.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(FootballActivity1.this,FOOTBALLSCHEDULER.class);
        startActivity(intent);
    }
});
ongoingfootball.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(FootballActivity1.this,ongoinggames.class);
        startActivity(intent);
    }
});
    }
}