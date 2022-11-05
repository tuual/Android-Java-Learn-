package tual.gokmen.androidlearn;

import android.content.Context;
import android.content.Intent;
import android.hardware.lights.LightState;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.time.temporal.Temporal;
import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.tanimla> {

    Context context;
    List<CardModel> list;

    public CardAdapter(Context context, List<CardModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public tanimla onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item,parent,false);
        return new tanimla(view);
    }

    private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,DerslerIcerikActivity.class);

        }
    };
    @Override
    public void onBindViewHolder(@NonNull tanimla holder, int position) {
        holder.baslik.setText(list.get(position).getBaslik());
        holder.numara.setText(list.get(position).getNumara());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class tanimla extends RecyclerView.ViewHolder
    {


        TextView baslik,numara;

        public tanimla(@NonNull View itemView) {
            super(itemView);
            baslik = (TextView) itemView.findViewById(R.id.titleTv);
            numara = (TextView) itemView.findViewById(R.id.baslikNumara);
        }
    }
}
