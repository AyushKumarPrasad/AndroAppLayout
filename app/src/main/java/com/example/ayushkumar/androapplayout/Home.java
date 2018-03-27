package com.example.ayushkumar.androapplayout;

import android.os.Bundle;
 import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Home extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener
{

    GridLayout mainGrid;
    Button btn;
    LinearLayout linearLayout, l2, l3, l4, l5, l6;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        linearLayout = (LinearLayout) findViewById(R.id.card1);
        linearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Home.this, FirstCard.class);
                startActivity(ayush);
            }
        });

        l2 = (LinearLayout) findViewById(R.id.card2);
        l2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Home.this, SecondCard.class);
                startActivity(ayush);
            }
        });

        l3 = (LinearLayout) findViewById(R.id.card3);
        l3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Home.this, ThirdCard.class);
                startActivity(ayush);
            }
        });

        l4 = (LinearLayout) findViewById(R.id.card4);
        l4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Home.this, FourthCard.class);
                startActivity(ayush);
            }
        });

        l5 = (LinearLayout) findViewById(R.id.card5);
        l5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Home.this, SecondCard.class);
                startActivity(ayush);
            }
        });

        l2 = (LinearLayout) findViewById(R.id.card6);
        l2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(Home.this, SecondCard.class);
                startActivity(ayush);
            }
        });


        Toolbar toolbar1 = (Toolbar) findViewById(R.id.toolbar1); // get the reference of Toolbar
        setSupportActionBar(toolbar1); // Setting/replace toolbar as the ActionBar
        getSupportActionBar().setDisplayShowTitleEnabled(false); // hide the current title from the Toolbar
        toolbar.setLogo(R.drawable.logoo); // setting a logo in toolbar

        toolbar.setTitle("Hindi Muhavre");

        btn = (Button) findViewById(R.id.sharebutton);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your Body Here";
                String shareSub = "Your Subject Here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody );
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });
    }

    @Override
    public void onBackPressed()
    {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }
        else
            {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item)
    {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera)
        {
            // Handle the camera action
        } else if (id == R.id.nav_gallery)
        {

        } else if (id == R.id.nav_slideshow)
        {

        } else if (id == R.id.nav_manage)
        {

        } else if (id == R.id.nav_share)
        {

        } else if (id == R.id.nav_send)
        {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
