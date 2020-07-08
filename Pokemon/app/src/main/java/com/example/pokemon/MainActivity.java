package com.example.pokemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

// this is the right one 
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pokemon> myPokemons = new ArrayList<>();

        Pokemon p1 = new Pokemon("Bulbasaur",R.drawable.bulbasaur,49,49,318);
        Pokemon p2 = new Pokemon("charizard",R.drawable.charizard,84,78,435);
        Pokemon p3 = new Pokemon("Pikachu",R.drawable.pika,55,40,320);
        Pokemon p4 = new Pokemon("Clefable",R.drawable.clef,70,73,483);

        myPokemons.add(p1);
        myPokemons.add(p2);
        myPokemons.add(p3);
        myPokemons.add(p4);

        RecyclerView rv =findViewById(R.id.RV);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);


        MyAdapter adapter = new MyAdapter(myPokemons,this);
        rv.setAdapter(adapter);


    }
}