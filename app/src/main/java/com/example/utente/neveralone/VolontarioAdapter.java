package com.example.utente.neveralone;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Utente on 27/01/2017.
 */
public class Adapter extends RecyclerView.Adapter<VolontarioAdapter.DisagioViewHolder> {

    ArrayList<Disagio> dataSet = new ArrayList<>();

    @Override
    public DisagioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_disagio,parent,false);
        DisagioViewHolder holder = new DisagioViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(DisagioViewHolder holder, int position) {

        Disagio disagioCorrente = dataSet.get(position);
        holder.disagioDichiarato.setText(disagioCorrente.getDisagio());
        holder.disagiato.setText(disagioCorrente.getDisagiato());
        holder.posizione.setText(disagioCorrente.getPosizione());

    }

    public void setDataSet(ArrayList<Disagio> disagii){
        dataSet = disagii;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    protected class DisagioViewHolder extends RecyclerView.ViewHolder{

        public TextView disagioDichiarato,disagiato,posizione;

        public DisagioViewHolder(View itemView) {

            super(itemView);

            disagioDichiarato = (TextView) itemView.findViewById(R.id.disagio);
            disagiato =  (TextView) itemView.findViewById(R.id.nome_disagiato);
            posizione =  (TextView) itemView.findViewById(R.id.posizione);

            itemView.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "Dettagli Disagio : " + dataSet.get(getAdapterPosition()).getSpecifiche(), Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
