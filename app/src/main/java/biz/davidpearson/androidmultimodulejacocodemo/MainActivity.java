package biz.davidpearson.androidmultimodulejacocodemo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import biz.davidpearson.androidmultimodulejacocodemo.model.Mork;
import biz.davidpearson.androidmultimodulejacocodemo.model.Mxyztplk;
import biz.davidpearson.mylibraryone.Bazinga;
import biz.davidpearson.mylibraryone.Pasghetti;
import biz.davidpearson.mylibrarythree.Pigglywiggly;
import biz.davidpearson.mylibrarytwo.Supercalifragilisticexpialidocious;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show());

        TextView tv = findViewById(R.id.message);

        Mxyztplk mxyztplk = Mxyztplk.MxyztplkBuilder.aMxyztplk().withYear(1944).withEra("Bronze").build();

        Mork mork = new Mork.Builder().naNuNaNu("Shazbot").build();

        Supercalifragilisticexpialidocious
                supercalifragilisticexpialidocious =
                new Supercalifragilisticexpialidocious(5);

        Pasghetti pasghetti = new Pasghetti("Rustiche");

        Pigglywiggly pigglywiggly = new Pigglywiggly("210 Second Avenue, Gallipolis, OH 45631");

        Bazinga bazinga = new Bazinga("Leonard Leakey Hofstadter");





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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}