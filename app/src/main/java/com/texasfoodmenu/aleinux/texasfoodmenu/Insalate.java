package com.texasfoodmenu.aleinux.texasfoodmenu;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Insalate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insalate);

        //font personalizzato
        Typeface typeface = Typeface.createFromAsset(getAssets(),"Playbill.ttf");
        ((TextView) findViewById(R.id.textInsalate)).setTypeface(typeface);
        ((TextView) findViewById(R.id.textNormale)).setTypeface(typeface);
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent i = new Intent(Insalate.this, info.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
