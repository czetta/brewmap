package com.example.brewmap.ui.main;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.brewmap.R;
import com.example.brewmap.model.Brewery;
import com.example.brewmap.ui.brewery.BreweryActivity;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private Context context;
    private List<Brewery> breweries;

    public MainAdapter(Context context, List<Brewery> breweries){
        this.context=context;
        this.breweries=breweries;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_brewery, viewGroup, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Brewery brewery = breweries.get(position);
        holder.tvBName.setText(brewery.getName());
        holder.tvBName.setOnClickListener((v)->{
            Intent intent=new Intent(context, BreweryActivity.class);
            intent.putExtra("brewery", brewery);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return breweries.size();
    }

    protected static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvBName;
        //public ConstraintLayout cardLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            tvBName=itemView.findViewById(R.id.tvBName);
            //cardLayout=itemView.findViewById(R.id.cardLayout);
        }
    }
}
