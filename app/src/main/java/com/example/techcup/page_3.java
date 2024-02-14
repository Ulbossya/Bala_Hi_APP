package com.example.techcup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class page_3 extends AppCompatActivity implements View.OnClickListener {
    public ImageView jeti_togyz_jas;
    public ImageView on_onbes_jas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_3);

        jeti_togyz_jas = (ImageView) findViewById(R.id.jeti_togyz_jas);
        on_onbes_jas = (ImageView) findViewById(R.id.on_onbes_jas);




        jeti_togyz_jas.setOnClickListener(this);
        on_onbes_jas.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.jeti_togyz_jas:
                i = new Intent(this,jeti_togyz_jas.class);
                startActivity(i);
                break;

            case R.id.on_onbes_jas:
                i = new Intent(this,on_onbes_jas.class);
                startActivity(i);
                break;

        }
    }

}