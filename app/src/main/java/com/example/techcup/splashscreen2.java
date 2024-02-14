package com.example.techcup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class splashscreen2 extends AppCompatActivity implements View.OnClickListener {
    public ImageView bastau;
    public ImageView qosymsha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen_2);

        bastau = (ImageView) findViewById(R.id.bastau);
        qosymsha = (ImageView) findViewById(R.id.qosymsha);




        bastau.setOnClickListener(this);
        qosymsha.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.bastau:
                i = new Intent(this,page_3.class);
                startActivity(i);
                break;

            case R.id.qosymsha:
                i = new Intent(this,qosymsha.class);
                startActivity(i);
                break;

        }
    }

}