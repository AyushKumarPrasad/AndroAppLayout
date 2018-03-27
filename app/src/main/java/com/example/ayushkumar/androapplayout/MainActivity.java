package com.example.ayushkumar.androapplayout;

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

public class MainActivity extends AppCompatActivity
{

    GridLayout mainGrid;
    Button btn;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

 /*       mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        linearLayout = (LinearLayout) findViewById(R.id.card1);
        linearLayout.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent ayush = new Intent(MainActivity.this, FirstCard.class);
                startActivity(ayush);
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar1); // get the reference of Toolbar
        setSupportActionBar(toolbar); // Setting/replace toolbar as the ActionBar
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
        });    */


    }


}


/*


<?xml version="1.0" encoding="utf-8"?>
<LinearLayout

        android:orientation="vertical"
        android:background="@drawable/pogs"
        android:weightSum="10"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        tools:context="com.example.ayushkumar.androapplayout.MainActivity"
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools">

    <android.support.v7.widget.Toolbar
        android:alpha="0.9"
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:id="@+id/toolbar1"
        android:paddingEnd="10dp"
        app:titleMarginStart="85dp"
        android:background="#00695C"
        android:theme="@style/ThemeOverlay.AppCompat.Dark">

        <Button
            android:layout_width="40dp"
            android:background="@drawable/share"
            android:layout_height="40dp"
            android:id="@+id/sharebutton"
            android:layout_gravity="right" />
    </android.support.v7.widget.Toolbar>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_weight="1"
        android:layout_height="0dp"></LinearLayout>

    <GridLayout

        android:id="@+id/mainGrid"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="8"
        android:alignmentMode="alignMargins"
        android:columnCount="2"
        android:columnOrderPreserved="false"
        android:padding="10dp"
        android:rowCount="3">
        <!-- Row 1 -->

        <!-- Column 1 -->
        <android.support.v7.widget.CardView

            android:layout_width="0dp"

            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            android:clickable="true"
            android:focusable="true"
            app:cardBackgroundColor="#F9D18B"
            app:cardCornerRadius="8dp"
            app:cardElevation="8dp">

            <LinearLayout

                android:id="@+id/card1"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="5dp"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_horizontal"
                    android:contentDescription="TODO"
                    android:src="@drawable/me_time" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:text="@string/muhavre_arth_aur_vakya"
                    android:textAlignment="center"
                    android:textColor="@android:color/black"
                    android:textSize="14sp"
                    android:textStyle="bold" />

            </LinearLayout>

        </android.support.v7.widget.CardView>

        <!-- Column 2 -->
        <android.support.v7.widget.CardView
            android:layout_width="0dp"

            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            android:clickable="true"
            android:focusable="true"
            app:cardBackgroundColor="#F9D18B"
            app:cardCornerRadius="8dp"
            app:cardElevation="8dp">

            <LinearLayout
                android:id="@+id/card2"
                android:layout_width="match_parent"
                android:layout_height="match_parent"

                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="5dp"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_horizontal"
                    android:contentDescription="TODO"
                    android:src="@drawable/family_time" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"

                    android:layout_gravity="center"
                    android:text="@string/muhavre_aur_vakya"
                    android:textAlignment="center"
                    android:textColor="@android:color/black"
                    android:textSize="14sp"
                    android:textStyle="bold" />

            </LinearLayout>

        </android.support.v7.widget.CardView>

        <!-- Row 1 -->

        <!-- Column 1 -->
        <android.support.v7.widget.CardView
            android:layout_width="0dp"

            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            android:clickable="true"
            android:focusable="true"
            app:cardBackgroundColor="#F9D18B"
            app:cardCornerRadius="8dp"
            app:cardElevation="8dp">

            <LinearLayout
                android:id="@+id/card3"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="5dp"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_horizontal"
                    android:contentDescription="TODO"
                    android:src="@drawable/lovely_time" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:text="@string/muhavre"
                    android:textAlignment="center"
                    android:textColor="@android:color/black"
                    android:textSize="14sp"

                    android:textStyle="bold" />

            </LinearLayout>

        </android.support.v7.widget.CardView>

        <!-- Column 2 -->
        <android.support.v7.widget.CardView
            android:layout_width="0dp"
            android:layout_height="0dp"

            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            android:clickable="true"
            android:focusable="true"
            app:cardBackgroundColor="#F9D18B"
            app:cardCornerRadius="8dp"
            app:cardElevation="8dp">

            <LinearLayout
                android:id="@+id/card4"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="5dp"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_horizontal"
                    android:contentDescription="TODO"
                    android:src="@drawable/team_time" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:text="@string/kramankh_anusar_muhavre"
                    android:textAlignment="center"
                    android:textColor="@android:color/black"
                    android:textSize="14sp"

                    android:textStyle="bold" />

            </LinearLayout>

        </android.support.v7.widget.CardView>

        <!-- Row 1 -->

        <!-- Column 1 -->
        <android.support.v7.widget.CardView
            android:layout_width="0dp"

            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            android:clickable="true"
            android:focusable="true"
            app:cardBackgroundColor="#F9D18B"
            app:cardCornerRadius="8dp"
            app:cardElevation="8dp">

            <LinearLayout
                android:id="@+id/card5"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="5dp"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_horizontal"
                    android:contentDescription="TODO"
                    android:src="@drawable/friends" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:text="@string/sampark_kare"
                    android:textAlignment="center"
                    android:textColor="@android:color/black"
                    android:textSize="14sp"
                    android:textStyle="bold" />

            </LinearLayout>

        </android.support.v7.widget.CardView>

        <!-- Column 2 -->
        <android.support.v7.widget.CardView
            android:layout_width="0dp"

            android:layout_height="0dp"
            android:layout_columnWeight="1"
            android:layout_marginBottom="16dp"
            android:layout_marginLeft="16dp"
            android:layout_marginRight="16dp"
            android:layout_rowWeight="1"
            android:clickable="true"
            android:focusable="true"
            app:cardBackgroundColor="#F9D18B"
            app:cardCornerRadius="8dp"
            app:cardElevation="8dp"
            tools:targetApi="lollipop">

            <LinearLayout
                android:id="@+id/card6"
                android:layout_width="match_parent"

                android:layout_height="match_parent"
                android:layout_gravity="center_horizontal|center_vertical"
                android:layout_margin="5dp"
                android:orientation="vertical">

                <ImageView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center_horizontal"
                    android:contentDescription="@string/todo"
                    android:src="@drawable/calendar" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    android:text="@string/pasandita_muhavre"
                    android:textAlignment="center"
                    android:textColor="@android:color/black"
                    android:textSize="14sp"

                    android:textStyle="bold" />

            </LinearLayout>

        </android.support.v7.widget.CardView>

    </GridLayout>

    </LinearLayout>


 */