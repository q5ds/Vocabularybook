package com.example.vocabularybook;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.vocabularybook.MainActivity;

public class HelpActivity extends AppCompatActivity
{

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int itemId = item.getItemId();
        if(itemId == R.id.menuItem_vocabulary)
        {
            Intent intent = new Intent(HelpActivity.this, MainActivity.class);
            startActivity(intent);
        }

        else
        {

        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
    }
}
