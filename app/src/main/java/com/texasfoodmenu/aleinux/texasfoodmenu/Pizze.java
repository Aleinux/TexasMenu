package com.texasfoodmenu.aleinux.texasfoodmenu;

import android.content.Intent;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.animation.ScaleAnimation;
import android.widget.TableLayout;
import android.widget.TextView;

public class Pizze extends AppCompatActivity {

    private TableLayout tab;
    private Matrix matrix = new Matrix();
    private float mScale = 1f;
    private ScaleGestureDetector scaleGestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizze);

        //font personalizzato
        Typeface typeface = Typeface.createFromAsset(getAssets(),"Playbill.ttf");
        ((TextView) findViewById(R.id.textPizze)).setTypeface(typeface);
        ((TextView) findViewById(R.id.textNormale)).setTypeface(typeface);
        ((TextView) findViewById(R.id.textMaxi)).setTypeface(typeface);

        scaleGestureDetector = new ScaleGestureDetector(this, new ScaleListener());
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
            Intent i = new Intent(Pizze.this, info.class);
            startActivity(i);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        scaleGestureDetector.onTouchEvent(ev);
        return true;
    }
/*
    private class ScaleListener extends
            ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scale *= detector.getScaleFactor();
            scale = Math.max(0.1f, Math.min(scale, 5.0f));
            matrix.setScale(scale, scale);
            //tab.setImageMatrix(matrix);
            return true;
        }
    }
*/
    private class ScaleListener extends
            ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            float scale = 1 - detector.getScaleFactor();

            float prevScale = mScale;
            mScale += scale;

            if (mScale < 0.1f) // Minimum scale condition:
                mScale = 0.1f;

            if (mScale > 10f) // Maximum scale condition:
                mScale = 10f;
            ScaleAnimation scaleAnimation = new ScaleAnimation(1f / prevScale,
                    1f / mScale, 1f / prevScale, 1f / mScale,
                    detector.getFocusX(), detector.getFocusY());
            scaleAnimation.setDuration(0);
            scaleAnimation.setFillAfter(true);

// your layout you want pinch zoom
            TableLayout layout = (TableLayout) findViewById(R.id.tabella);
            layout.startAnimation(scaleAnimation);

            return true;
        }
    }
}
