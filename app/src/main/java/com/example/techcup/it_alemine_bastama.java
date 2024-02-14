package com.example.techcup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class it_alemine_bastama extends AppCompatActivity implements View.OnClickListener {
    public ImageView tolygyraq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.it_alemine_bastama);

        tolygyraq = (ImageView) findViewById(R.id.tolygyraq);
        tolygyraq.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.tolygyraq:
                i = new Intent(this,tolygyraq_it.class);
                startActivity(i);
                break;



        }
    }}