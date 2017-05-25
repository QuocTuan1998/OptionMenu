package com.example.quoctuan.optionmenu;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtColor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addControls();
    }

    private void addControls() {
        txtColor = (TextView) findViewById(R.id.txtColor);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.mnuRed){
            txtColor.setBackgroundColor(Color.RED);
        }
        else if(item.getItemId() == R.id.mnuBlue){
            txtColor.setBackgroundColor(Color.BLUE);
        }
        else if(item.getItemId() == R.id.mnuYellow){
            txtColor.setBackgroundColor(Color.YELLOW);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
}
