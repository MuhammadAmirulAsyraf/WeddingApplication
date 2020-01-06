package com.example.weddingapplication;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private Button weddingtheme_button;
    private Button venue_button;
    private Button dais_button;
    private Button accessories_button;
    private Button dress_button;
    private Button video_button;

    private Button addinfo_button;
    private Button accessoriesmen_button;

    private WebView webView;

    private DrawerLayout slide;
    private ActionBarDrawerToggle toggle;
    NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        video_button = findViewById(R.id.video_button);
        video_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VideoPhotography.class);
                startActivity(intent);

            }
        });

        weddingtheme_button = findViewById(R.id.weddingtheme_button);
        weddingtheme_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WeddingTheme.class);
                startActivity(intent);

            }
        });

            venue_button = findViewById(R.id.venue_button);
            venue_button.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Venue.class);
                startActivity(intent);
            }
        });

        dais_button = findViewById(R.id.dais_button);
        dais_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DaisWedding.class);
                startActivity(intent);
            }
        });

        accessories_button = findViewById(R.id.accessories_button);
        accessories_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AccessoriesWedding.class);
                startActivity(intent);
            }
        });

        dress_button = findViewById(R.id.dress_button);
        dress_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DressWedding.class);
                startActivity(intent);
            }
        });

        addinfo_button = findViewById(R.id.addinfo_button);
        addinfo_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdditionalInformation.class);
                startActivity(intent);
            }
        });

        accessoriesmen_button = findViewById(R.id.accessoriesmen_button);
        accessoriesmen_button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AccessoriesMen.class);
                startActivity(intent);
            }
        });


        //drawer layout
        slide = findViewById(R.id.drawer);
        slide.setFitsSystemWindows(true);
        toggle = new ActionBarDrawerToggle(this,slide,R.string.open,R.string.close);

        slide.addDrawerListener(toggle);
        toggle.syncState();

        //navigation view in drawer layout
        navigationView = findViewById(R.id.navView);
        navigationView.setNavigationItemSelectedListener(this);

        //set the header programmatically
        //View headerLayout = navigationView.getHeaderView(R.layout.header_slide_navigation);  upper version
        View headerLayout = navigationView.inflateHeaderView(R.layout.header_slide_navigation);  //lower version
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); //show everything on action bar : TRUE or FALSE

    }

    //when click on slide menu, this will happen
    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem)
    {
        switch(menuItem.getItemId())
        {
            case R.id.Account:
                Intent Account = new Intent (this, Login.class);
                startActivity(Account);
                break;
        }

        slide.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();

        if (slide.isDrawerOpen( GravityCompat.START))
        {
            slide.closeDrawers();
            return;
        }
    }

}

