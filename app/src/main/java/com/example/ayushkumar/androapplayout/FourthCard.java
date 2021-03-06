package com.example.ayushkumar.androapplayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FourthCard extends AppCompatActivity {

    private static final String URL = "https://api.github.com/users";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth_card);

        final RecyclerView userList = (RecyclerView) findViewById(R.id.userList4);
        userList.setLayoutManager(new LinearLayoutManager(this));

        StringRequest request = new StringRequest(URL, new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response)
            {
                Log.d("CODE", response);

                GsonBuilder gsonBuilder = new GsonBuilder();

                Gson gson = gsonBuilder.create();
                User [] users = gson.fromJson(response, User [].class);
                userList.setAdapter(new GithubAdapter(FourthCard.this, users));
            }
        },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error)
                    {
                        Toast.makeText(FourthCard.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                    }
                });

        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(request);
    }
}
