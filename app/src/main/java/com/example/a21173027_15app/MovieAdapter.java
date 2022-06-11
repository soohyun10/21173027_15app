package com.example.a21173027_15app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {
    ArrayList<Movie> items = new ArrayList<Movie>();
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = inflater.inflate(R.layout.movie_item, viewGroup, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Movie item = items.get(position);
        viewHolder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void addItem(Movie item){
        items.add(item);
    }
    public void setItems(ArrayList<Movie> items){
        this.items = items;
    }
    public Movie getItem(int position){
        return items.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView movieName;
        TextView peopleCount;
        TextView Rank;
        TextView audiAcc1;
        TextView salesAcc1;
        public ViewHolder(View itemView){
            super(itemView);
            movieName = itemView.findViewById(R.id.movieName);
            peopleCount = itemView.findViewById(R.id.peopleCount);
            Rank = itemView.findViewById(R.id.Rank);
            audiAcc1 = itemView.findViewById(R.id.audiAcc1);
            salesAcc1 = itemView.findViewById(R.id.salesAcc1);
        }
        public void setItem(Movie item)
        {
            movieName.setText(item.movieNm);
            peopleCount.setText(item.audiCnt + " 명");
            Rank.setText(item.rank + " 위");
            audiAcc1.setText(" 누적 관객수 : " + item.audiAcc + " 명");
            salesAcc1.setText("누적매출액 : " + item.salesAcc + " 원");
        }
    }
}
