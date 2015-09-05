package com.texasfoodmenu.aleinux.texasfoodmenu;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_pizze = (Button)findViewById(R.id.button_pizze);
        button_pizze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_pizze = new Intent(MainActivity.this, Pizze.class);
                startActivity(intent_pizze);
            }
        });

        Button button_panini = (Button)findViewById(R.id.button_panini);
        button_panini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_panini = new Intent(MainActivity.this, Panini.class);
                startActivity(intent_panini);
            }
        });

        Button button_piadine = (Button)findViewById(R.id.button_piadine);
        button_piadine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_piadine = new Intent(MainActivity.this, Piadine.class);
                startActivity(intent_piadine);
            }
        });

        Button button_stuzzicheria = (Button)findViewById(R.id.button_stuzzicheria);
        button_stuzzicheria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_stuzzicheria = new Intent(MainActivity.this, Stuzzicheria.class);
                startActivity(intent_stuzzicheria);
            }
        });

        Button button_insalate = (Button)findViewById(R.id.button_insalate);
        button_insalate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_insalate = new Intent(MainActivity.this, Insalate.class);
                startActivity(intent_insalate);
            }
        });

        Button button_stromboli = (Button)findViewById(R.id.button_stromboli);
        button_stromboli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_stromboli = new Intent(MainActivity.this, Stromboli.class);
                startActivity(intent_stromboli);
            }
        });

        Button button_salse = (Button)findViewById(R.id.button_salse);
        button_salse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_salse = new Intent(MainActivity.this, Salse.class);
                startActivity(intent_salse);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch (item.getItemId()){
            case R.id.action_settings:
                Intent i = new Intent(MainActivity.this, info.class);
                startActivity(i);
                return true;
            case R.id.exit:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
