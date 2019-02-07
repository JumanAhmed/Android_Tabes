package com.example.juman.hivetabes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.mtoolbar);
        setSupportActionBar(toolbar);

    }

    public void simpleTabs(View view) {
        Intent i = new Intent(this, SimpleTabs.class);
        startActivity(i);
    }

    public void ScrollableTabs(View view) {

        Intent i = new Intent(this, ScrollableTabs.class);
        startActivity(i);
    }

    public void iconAndTextTabs(View view) {
        Intent i = new Intent(this, IconAndTabs.class);
        startActivity(i);

    }

    public void onlyIconTabs(View view) {
        Intent i = new Intent(this, TabsWithOnlyIcon.class);
        startActivity(i);

    }

    public void customIconAndText(View view) {
        Intent i = new Intent(this, CustomIconAndText.class);
        startActivity(i);
    }

    public void extraImpliment(View view) {
        Intent i = new Intent(this, MyCustomTabs.class);
        startActivity(i);

    }
}
