package com.example.equifilm.listviewexample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] favoriteTVShows = {"Pushing Daisies", "Better Off Ted", "Twin Peaks", "Freaks and Geeks", "Orpgan Black", "Walking Dad",
        "Breaking Bad", "The 400", "Alphas", "Life On Mars", "Breaking Bad", "The 400", "Alphas", "Life On Mars", "Breaking Bad", "The 400", "Alphas", "Life On Mars"};

        ListAdapter theAdapter = new MyAdapter(this, favoriteTVShows);
        ListView theListView = (ListView) findViewById(R.id.theListView);
        theListView.setAdapter(theAdapter);
        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                    @Override
                                                    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                                                        String tvShowPicked = "You selected " +
                                                                String.valueOf(adapterView.getItemAtPosition(position));
                                                        Toast.makeText(MainActivity.this, tvShowPicked, Toast.LENGTH_SHORT).show();
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
