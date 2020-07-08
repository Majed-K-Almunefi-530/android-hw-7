package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle b = getIntent().getExtras();
        Pokemon p =(Pokemon) b.getSerializable("Pokemon");

        TextView name = findViewById(R.id.textView3);
        TextView total = findViewById(R.id.textView6);
        TextView defence = findViewById(R.id.textView4);
        TextView attack = findViewById(R.id.textView5);
        ImageView logo = findViewById(R.id.imageView7);


        name.setText(p.getName());
        total.setText(p.getTotal()+"");
        defence.setText(p.getDefense()+"");
        attack.setText(p.getAttack()+"");
        total.setText(p.getTotal()+"");
        logo.setImageResource(p.getImage());


    }
}