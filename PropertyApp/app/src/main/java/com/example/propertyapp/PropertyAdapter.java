package com.example.propertyapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PropertyAdapter extends RecyclerView.Adapter<PropertyAdapter.PropertyViewHolder> {
    private List<Property> properties;
    private Picasso picasso;

    public PropertyAdapter(List<Property> properties, Context context) {
        this.properties = properties;
        this.picasso = new Picasso.Builder(context).build();
    }
    public PropertyAdapter(List<Property> properties) {
        this.properties = properties;
    }

    @NonNull
    @Override
    public PropertyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.property_item, parent, false);
        return new PropertyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PropertyViewHolder holder, int position) {
        Property property = properties.get(position);
        holder.titleTextView.setText(property.getTitle());
        holder.addressTextView.setText(property.getAddress());
        Picasso.get().load(property.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return properties.size();
    }

    public static class PropertyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView titleTextView;
        public TextView addressTextView;

        public PropertyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.property_image);
            titleTextView = itemView.findViewById(R.id.property_title);
            addressTextView = itemView.findViewById(R.id.property_address);
        }
    }
}
