package tual.gokmen.androidlearn;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.tanimla> {

    Context context;
    List<CardModel> list;
    public CardAdapter(Context context, List<CardModel> list) {
        this.context = context;
        this.list = list;
    }

    public  void setFilteredList(List<CardModel> filteredList){
        this.list = filteredList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public tanimla onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item,parent,false);
        return new tanimla(view);
    }


    @Override
    public void onBindViewHolder(@NonNull tanimla holder, @SuppressLint("RecyclerView") int position) {
        holder.baslik.setText(list.get(position).getBaslik());
        holder.numara.setText(list.get(position).getNumara());
        holder.aciklama.setText(list.get(position).getAciklama());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,DerslerIcerik.class);
                intent.putExtra("Baslik",list.get(position).getBaslik());
                intent.putExtra("Aciklama",list.get(position).getAciklama());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class tanimla extends RecyclerView.ViewHolder
    {


        TextView baslik,numara,aciklama;

        public tanimla(@NonNull View itemView) {
            super(itemView);
            baslik = (TextView) itemView.findViewById(R.id.titleTv);
            numara = (TextView) itemView.findViewById(R.id.baslikNumara);
            aciklama = (TextView) itemView.findViewById(R.id.aciklamaTv);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {




                }
            });
        }
    }
}
