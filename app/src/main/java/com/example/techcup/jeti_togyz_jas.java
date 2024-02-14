package com.example.techcup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class jeti_togyz_jas extends AppCompatActivity implements View.OnClickListener {
    public ImageView it_alemi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jeti_togyz_jas);
        it_alemi = (ImageView) findViewById(R.id.it_alemi);
        it_alemi.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.it_alemi:
                i = new Intent(this,it_alemine_bastama.class);
                startActivity(i);
                break;



        }
    }}