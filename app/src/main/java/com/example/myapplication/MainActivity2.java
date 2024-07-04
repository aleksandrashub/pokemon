package com.example.myapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;

public class MainActivity2 extends AppCompatActivity {
    public TextView pokemonName;
public  TextView namePokemon;
public TextView idPok;
public ImageView pokImg;
public ImageView stat;
public TextView pokTypes;
public  TextView description;
public TextView weightPokemon;
public TextView heightPokemon;
public  TextView about;
public  TextView movesPokemon;
public ImageButton vyhod;
public LinearLayout layout;
public  TextView statHp;
public  ImageView type1;
public ImageView type2;
public TextView statAtk;
public TextView statDef;
public  TextView statSatk;
public TextView statSdef;
public TextView baseStats;
public  TextView statSpd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        ImageButton vyhod = (ImageButton) findViewById(R.id.exitBtn);
        vyhod.setOnClickListener(new View.OnClickListener() {
                                     public void onClick(View v) {
                                         Intent intent2 = new Intent(MainActivity2.this, MainActivity.class);
                                         startActivity(new Intent(MainActivity2.this, MainActivity.class));

                                     }}
                                 );
//pokType1
        about = (TextView)findViewById(R.id.textAbout);
  //  type1 = (ImageView) findViewById(R.id.types);
  //  type2 = (ImageView) findViewById(R.id.types);
         pokTypes = (TextView) findViewById(R.id.types);
    baseStats = (TextView)findViewById(R.id.baseStatsColor);
         statHp = (TextView)findViewById(R.id.hpStat);
         String hp = getIntent().getStringExtra("hp");
         statHp.append(hp);

         statSdef = (TextView)findViewById(R.id.sdefStat);
         String sdef = getIntent().getStringExtra("sdef");
         statSdef.append(sdef);

         statSpd = (TextView)findViewById(R.id.spdStat);
         String spd = getIntent().getStringExtra("spd");
         statSpd.append(spd);

         statAtk = (TextView)findViewById(R.id.atkStat);
         String atk = getIntent().getStringExtra("atk");
         statAtk.append(atk);

         statDef = (TextView)findViewById(R.id.defStat);
         String def = getIntent().getStringExtra("def");
         statDef.append(def);

         statSatk = (TextView)findViewById(R.id.satkStat);
         String satk = getIntent().getStringExtra("satk");
         statSatk.append(satk);

        pokemonName = findViewById(R.id.pokName);
        String name = getIntent().getStringExtra("name").toString();
        pokemonName.append("" + name);

        description = (TextView)findViewById(R.id.descrPok);
        String descript =getIntent().getStringExtra("descr").toString();
        description.append(descript);
        //  Intent intent = getIntent();
       String idPokemon = getIntent().getStringExtra("id");

         idPok = (TextView) findViewById(R.id.idPok);
        idPok.append("#"+idPokemon);

        movesPokemon = (TextView)findViewById(R.id.movesPok);
        String moves = getIntent().getStringExtra("moves").toString();
        movesPokemon.append(moves);

        weightPokemon = (TextView)findViewById(R.id.weightPok);
        String weight = getIntent().getStringExtra("weight").toString();
        weightPokemon.append(weight);

        ImageView stat = (ImageView)findViewById(R.id.statimgPok);
        heightPokemon = (TextView)findViewById(R.id.heightPok);
        String height = getIntent().getStringExtra("height").toString();
        heightPokemon.append(height);

        String color = getIntent().getStringExtra("color");
        LinearLayout layout  = (LinearLayout) findViewById(R.id.layoutPok);
        layout.setBackgroundColor(Color.parseColor(color));

ImageView pokImg = (ImageView) findViewById(R.id.pokemonImg);
switch (name)
{
    case "Bulbasaur":
        pokImg.setImageResource(R.drawable.bulbasaur);
        pokTypes.append("Grass");
       // type1.setImageResource(R.drawable.type1Bul);
       // type2.setImageResource(R.drawable.type2Bul);
        baseStats.setTextColor(Color.parseColor("#82d05a"));
        //baseStatsColor
        about.setTextColor(Color.parseColor("#82d05a"));
        pokTypes.setBackgroundColor(Color.parseColor("#82d05a"));
        TextView cloned = new TextView(getApplicationContext());
        cloned.append("Poison");
        cloned.setBackgroundColor(Color.parseColor("#a43e9e"));
        cloned.setLayoutParams(pokTypes.getLayoutParams());
    stat.setImageResource(R.drawable.stat1);
        break;
    case "Charmander":
            pokImg.setImageResource(R.drawable.charmander);
        stat.setImageResource(R.drawable.stat2);
        baseStats.setTextColor(Color.parseColor("#f57d31"));
        about.setTextColor(Color.parseColor("#f57d31"));
        pokTypes.setBackgroundColor(Color.parseColor("#f57d31"));
        pokTypes.append("Fire");
    break;
    case "Squirtle":
        pokImg.setImageResource(R.drawable.squirtle);
        stat.setImageResource(R.drawable.stat3);
        baseStats.setTextColor(Color.parseColor("#6493eb"));
        about.setTextColor(Color.parseColor("#6493eb"));
        pokTypes.setBackgroundColor(Color.parseColor("#6493eb"));
        pokTypes.append("Water");
        break;
    case "Butterfree":
        pokImg.setImageResource(R.drawable.butterfree);
        stat.setImageResource(R.drawable.stat4);
        about.setTextColor(Color.parseColor("#b0be39"));
        baseStats.setTextColor(Color.parseColor("#b0be39"));

        pokTypes.setBackgroundColor(Color.parseColor("#b0be39"));
        //#b0be39
        pokTypes.append("Bug");
        break;
    case "Pickachu":
        pokImg.setImageResource(R.drawable.pikachu);
        stat.setImageResource(R.drawable.stat5);
        baseStats.setTextColor(Color.parseColor("#fad444"));
        about.setTextColor(Color.parseColor("#fad444"));
        pokTypes.setBackgroundColor(Color.parseColor("#fad444"));
        //pokTypes.setBackgroundTintMode(Color.parseColor("#fad444"));
        pokTypes.append("Electric");
        break;
    case "Gastly":
        pokImg.setImageResource(R.drawable.gastly);
        stat.setImageResource(R.drawable.stat6);
        baseStats.setTextColor(Color.parseColor("#70559b"));
        about.setTextColor(Color.parseColor("#70559b"));
        pokTypes.setBackgroundColor(Color.parseColor("#70559b"));
        pokTypes.append("Ghost");
        break;
    case "Ditto":
        pokImg.setImageResource(R.drawable.ditto);
        stat.setImageResource(R.drawable.stat7);
        baseStats.setTextColor(Color.parseColor("#aaa67f"));
        about.setTextColor(Color.parseColor("#aaa67f"));
        pokTypes.setBackgroundColor(Color.parseColor("#aaa67f"));
        pokTypes.append("Ghost");
        break;
}
    }
}