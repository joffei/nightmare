package com.example.android.nightmare;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
/**
 * Created by sfbarton on 10/1/16.
 */

public class NewTimeActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_time);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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

    public void newTime() {
        hourSpinner();
        minSpinner();
        amPmSpinner();

    }
    private void hourSpinner() {
        Spinner hour = (Spinner) findViewById(R.id.hour);
        ArrayAdapter<CharSequence> hourAdapter = ArrayAdapter.createFromResource(this.getApplicationContext(),
                R.array.hour, android.R.layout.simple_spinner_item);
        hourAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hour.setAdapter(hourAdapter);
        hour.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
    private void minSpinner(){
        Spinner min = (Spinner) findViewById(R.id.min);
        ArrayAdapter<CharSequence> minAdapter = ArrayAdapter.createFromResource(this.getApplicationContext(),
                R.array.min, android.R.layout.simple_spinner_item);
        minAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        min.setAdapter(minAdapter);
        min.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
    private void amPmSpinner(){
        Spinner amPm = (Spinner) findViewById(R.id.amPm);
        ArrayAdapter<CharSequence> amPmAdapter = ArrayAdapter.createFromResource(this.getApplicationContext(),
                R.array.amPm, android.R.layout.simple_spinner_item);
        amPmAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        amPm.setAdapter(amPmAdapter);
        amPm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

}
