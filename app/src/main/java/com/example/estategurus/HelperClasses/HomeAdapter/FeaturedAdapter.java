package com.example.estategurus.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.estategurus.R;

import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.featuredViewHolder> {
    ArrayList<FeaturedHelperClass>featuredLocations;

    public FeaturedAdapter(ArrayList<FeaturedHelperClass> featuredLocations) {
        this.featuredLocations = featuredLocations;
    }

    @NonNull
    @Override
    public featuredViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_card_design,parent,false);
        featuredViewHolder featuredViewHolder = new featuredViewHolder(view);
        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull featuredViewHolder holder, int position) {
     FeaturedHelperClass featuredHelperClass = featuredLocations.get(position);
     holder.image.setImageResource(featuredHelperClass.getImage());
     holder.title.setText(featuredHelperClass.getTitle());
     holder.desc.setText(featuredHelperClass.getDescription());
    }

    @Override
    public int getItemCount() {
        return featuredLocations.size();
    }

    public static class featuredViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title,desc;

        public featuredViewHolder(@NonNull View itemView) {
            super(itemView);

            //Hooks

            image = itemView.findViewById(R.id.featured_image);
            title = itemView.findViewById(R.id.featured_title);
            desc = itemView.findViewById(R.id.featured_desc);

        }
    }
}
