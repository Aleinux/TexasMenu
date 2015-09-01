package com.texasfoodmenu.aleinux.texasfoodmenu;

import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.text.util.Linkify;


public class info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        //font Playbill
        //font personalizzato
        Typeface typeface = Typeface.createFromAsset(getAssets(),"Playbill.ttf");
        ((TextView) findViewById(R.id.texas)).setTypeface(typeface);
        ((TextView) findViewById(R.id.info_texas)).setTypeface(typeface);
        ((TextView) findViewById(R.id.cell)).setTypeface(typeface);
        ((TextView) findViewById(R.id.createdby)).setTypeface(typeface);

        TextView textCell=(TextView)findViewById(R.id.cell);
        textCell.setLinkTextColor(Color.BLACK);
        textCell.setText("3291884116");
        Linkify.addLinks(textCell, Linkify.PHONE_NUMBERS);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_info, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
