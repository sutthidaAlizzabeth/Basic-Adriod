package com.example.it18.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void plus(View v)
    {
        EditText var1 = (EditText)findViewById(R.id.var1);
        EditText var2 = (EditText)findViewById(R.id.var2);

        int x = Integer.parseInt(var1.getText().toString());
        int y = Integer.parseInt(var2.getText().toString());

        Toast.makeText(getApplicationContext(),"Result = "+ (x+y),Toast.LENGTH_SHORT).show();
    }

}
