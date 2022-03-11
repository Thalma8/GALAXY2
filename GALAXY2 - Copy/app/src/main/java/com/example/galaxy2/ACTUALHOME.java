package com.example.galaxy2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.TextView;

public class ACTUALHOME extends AppCompatActivity {
    public Button buttontennis;
    public Button buttonbasket;
    public Button buttonfootball;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualhome);

        TextView RegisterGame = (TextView) findViewById(R.id.RegisterGame);


        buttonfootball = (Button) findViewById(R.id.Footballbtn);
        buttonfootball.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ACTUALHOME.this,FootballActivity1.class);
                startActivity(intent);
            }
        });

        buttonbasket = (Button) findViewById(R.id.Basketballbtn);
        buttonbasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ACTUALHOME.this,basketactivity1.class);
                startActivity(intent);
            }
        });

        buttontennis = (Button) findViewById(R.id.Tennisbtn);
        buttontennis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ACTUALHOME.this,TennisActiviy.class);
                startActivity(intent);
            }
        });


    }
}
