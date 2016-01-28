package com.gosemathraj.myportfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("My App PortFolio");



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void displayToast(View view){
            Toast toast ;
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            if(view.getId() == R.id.button1){
                toast = Toast.makeText(context,"Spotify Streamer app is coming soon!",duration);
                toast.show();
            }else if(view.getId() == R.id.button2){
                toast = Toast.makeText(context,"Football Scores app is coming soon!",duration);
                toast.show();
            }else if(view.getId() == R.id.button3){
                toast = Toast.makeText(context,"Library app is coming soon!",duration);
                toast.show();
            }else if(view.getId() == R.id.button4){
                toast = Toast.makeText(context,"Build it bigger app is coming soon!",duration);
                toast.show();
            }else if(view.getId() == R.id.button5){
                toast = Toast.makeText(context,"XYZ Reader app is coming soon!",duration);
                toast.show();
            }else if(view.getId() == R.id.button6){
                toast = Toast.makeText(context,"Capstone:My own app is coming sooon!",duration);
                toast.show();
            }
        }



}
