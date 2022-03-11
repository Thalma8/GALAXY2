package com.example.galaxy2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TennisActiviy extends AppCompatActivity {
    ImageView tennisreg;
    ImageView ongoingtennis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tennis_activiy);
        tennisreg=findViewById(R.id.tennisreg);
        ongoingtennis=findViewById(R.id.ongoingtennis);

        tennisreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TennisActiviy.this,TENNISSCHEDULER.class);
                startActivity(intent);
            }
        });
ongoingtennis.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(TennisActiviy.this,ongoinggames.class);
        startActivity(intent);
    }
});
    }
}