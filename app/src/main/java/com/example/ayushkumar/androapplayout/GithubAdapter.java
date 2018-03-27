package com.example.ayushkumar.androapplayout;

/**
 * Created by ayushkumar on 15/02/18.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by ayushkumar on 13/02/18.
 */

public class GithubAdapter extends RecyclerView.Adapter<GithubAdapter.GithubViewHolder>
{
    private Context context;
    private User[] data ;

    // 1. constructor

    public GithubAdapter(Context context, User [] data)
    {
        this.context = context;
        this.data = data;
    }

    // 2. Layout inflater (show details in layout)

    @Override
    public GithubViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.item_user_layout, parent, false);
        return new GithubViewHolder(view);
    }

    // 3. retrieve data from url

    @Override
    public void onBindViewHolder(GithubViewHolder holder, int position)
    {
        User user = data[position];
        holder.txtUser.setText(user.getLogin());
        Glide.with(holder.imgUser.getContext()).load(user.getAvatarUrl()).into(holder.imgUser);
    }

    // 4. return total data to be retrieved

    @Override
    public int getItemCount()
    {
        return data.length;
    }

    // 5. retrieve specefic data into recycler view

    public class GithubViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imgUser;
        TextView txtUser;

        public GithubViewHolder(View itemView)
        {
            super(itemView);
            imgUser = (ImageView) itemView.findViewById(R.id.imgUser);
            txtUser = (TextView) itemView.findViewById(R.id.txtUser);
        }
    }
}
