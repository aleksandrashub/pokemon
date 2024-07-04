package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {
//#78cc4d bulbazavr
public ImageButton bulbazavr;
    public ImageButton charmander;
    public ImageButton squirtle;
    public ImageButton butterfree;
    public ImageButton pickachu;
    public ImageButton gastly;
    public ImageButton ditto;
    public  ImageButton mew;
    public ImageButton aron;
 //   public Image
    @Override
    protected void onCreate(Bundle savedInstanceState) {

       super.onCreate(savedInstanceState);
         EdgeToEdge.enable(this);
      setContentView(R.layout.activity_main);


        ImageButton bulbazavr = (ImageButton) findViewById(R.id.bulbazavrBtn);

     bulbazavr.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("id", "001");
                intent.putExtra("name", "Bulbasaur");
                intent.putExtra("type1", "Grass");
                intent.putExtra("type2", "Poison");
                intent.putExtra("weight", "6.9");
                intent.putExtra("height", "0.7");
                intent.putExtra("moves", "Chlorophyll Overgrow");
                intent.putExtra("hp", "045");
                intent.putExtra("atk", "049");
                intent.putExtra("def", "049");
                intent.putExtra("satk", "065");
                intent.putExtra("sdef", "065");
                intent.putExtra("sdef", "065");
                intent.putExtra("spd", "045");
                intent.putExtra("descr", "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.");
                intent.putExtra("color", "#78cc4d");
                startActivity(intent);
            }
        });

ImageButton charmander = (ImageButton) findViewById(R.id.charmanderBtn);
charmander.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("id", "004");
        intent.putExtra("name", "Charmander");
        intent.putExtra("type1", "Fire");
        intent.putExtra("type2", "");
        intent.putExtra("weight", "8.5");
        intent.putExtra("height", "0.6");
        intent.putExtra("moves", "Mega-Punch Fire-Punch");
        intent.putExtra("hp", "039");
        intent.putExtra("atk", "052");
        intent.putExtra("def", "043");
        intent.putExtra("satk", "060");
        intent.putExtra("sdef", "050");
        intent.putExtra("spd", "065");
        intent.putExtra("descr", "It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.");
        intent.putExtra("color", "#f57d31");
        startActivity(intent);
    }
});
ImageButton squirtle = (ImageButton) findViewById(R.id.squirtleBtn);
squirtle.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("id", "007");
        intent.putExtra("name", "Squirtle");
        intent.putExtra("type1", "Water");
        intent.putExtra("type2", "");
        intent.putExtra("weight", "9.0");
        intent.putExtra("height", "0.5");
        intent.putExtra("moves", "Torrent Rain-Dish");
        intent.putExtra("hp", "044");
        intent.putExtra("atk", "048");
        intent.putExtra("def", "065");
        intent.putExtra("satk", "050");
        intent.putExtra("sdef", "064");
        intent.putExtra("spd", "043");
        intent.putExtra("descr", "When it retracts its long neck into its shell, it squirts out water with vigorous force.");
        intent.putExtra("color", "#6493eb");
        startActivity(intent);
    }
});

ImageButton butterfree = (ImageButton) findViewById(R.id.butterfreeBtn);
butterfree.setOnClickListener(new View.OnClickListener() {
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("id", "012");
        intent.putExtra("name", "Butterfree");
        intent.putExtra("type1", "Bug");
        intent.putExtra("type2", "Flying");
        intent.putExtra("weight", "32.0");
        intent.putExtra("height", "1.1");
        intent.putExtra("moves", "Compound-Eyes Tinted-Lens");
        intent.putExtra("hp", "060");
        intent.putExtra("atk", "045");
        intent.putExtra("def", "050");
        intent.putExtra("satk", "090");
        intent.putExtra("sdef", "080");
        intent.putExtra("spd", "070");
        intent.putExtra("descr", "In battle, it flaps its wings at great speed to release highly toxic dust into the air.");
        intent.putExtra("color", "#b0be39");
        startActivity(intent);
    }
});


        ImageButton pickachu = (ImageButton) findViewById(R.id.pickachuBtn);
        pickachu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("id", "025");
                intent.putExtra("name", "Pickachu");
                intent.putExtra("type1", "Electric");
                intent.putExtra("weight", "6.0");
                intent.putExtra("height", "0.4");
                intent.putExtra("moves", "Mega-Punch Pay-Day");
                intent.putExtra("hp", "035");
                intent.putExtra("atk", "055");
                intent.putExtra("def", "040");
                intent.putExtra("satk", "050");
                intent.putExtra("sdef", "050");
                intent.putExtra("spd", "090");
                intent.putExtra("descr", "Pikachu that can generate powerful electricity have cheek sacs that are extra soft and super stretchy.");
                intent.putExtra("color", "#fad444");
                startActivity(intent);
            }
        });
        ImageButton gastly = (ImageButton) findViewById(R.id.gastlyBtn);
        gastly.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("id", "092");
                intent.putExtra("name", "Gastly");
                intent.putExtra("type1", "Ghost");
                intent.putExtra("weight", "0.1");
                intent.putExtra("height", "1.3");
                intent.putExtra("moves", "Levitate");
                intent.putExtra("hp", "030");
                intent.putExtra("atk", "035");
                intent.putExtra("def", "030");
                intent.putExtra("satk", "100");
                intent.putExtra("sdef", "035");
                intent.putExtra("spd", "080");
                intent.putExtra("descr", "Born from gases, anyone would faint if engulfed by its gaseous body, which contains poison.\n");
                intent.putExtra("color", "#70559b");
                startActivity(intent);
            }
        });


        ImageButton ditto = (ImageButton) findViewById(R.id.dittoBtn);
        ditto.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("id", "132");
                intent.putExtra("name", "Ditto");
                intent.putExtra("type1", "Normal");
                intent.putExtra("weight", "4.0");
                intent.putExtra("height", "0.3");
                intent.putExtra("moves", "Limber Imposter");
                intent.putExtra("hp", "048");
                intent.putExtra("atk", "048" +
                        "");
                intent.putExtra("def", "030");
                intent.putExtra("satk", "100");
                intent.putExtra("sdef", "035");
                intent.putExtra("spd", "080");
                intent.putExtra("descr", "Born from gases, anyone would faint if engulfed by its gaseous body, which contains poison.\n");
                intent.putExtra("color", "#aaa67f");
                startActivity(intent);
            }
        });



    }




}





