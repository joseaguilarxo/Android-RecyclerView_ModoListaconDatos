package com.joseaguilar.recyclerview_personalizado.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.joseaguilar.recyclerview_personalizado.Clases.Personajes;
import com.joseaguilar.recyclerview_personalizado.R;

import java.util.ArrayList;


//Paso 1: extends e importaciones de metodos
public class AdapterPersonajes extends RecyclerView.Adapter<AdapterPersonajes.ViewHolderPersonajes> {

    //Paso 2: Arraylist de la clase Personajes
    ArrayList<Personajes> listaPersonajes;

    //Paso 3: Constructor
    public AdapterPersonajes(ArrayList<Personajes> listaPersonajes) {
        this.listaPersonajes = listaPersonajes;
    }

    //Paso 4: vinculamos molde con adapter
    @Override
    public AdapterPersonajes.ViewHolderPersonajes onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.molde_personajes, null, false);
        return new ViewHolderPersonajes(view);
    }

    //Paso 7: llenamos los datos
    @Override
    public void onBindViewHolder(AdapterPersonajes.ViewHolderPersonajes holder, int position) {
        holder.txtnombre.setText(listaPersonajes.get(position).getNombre());
        holder.txtdescripcion.setText(listaPersonajes.get(position).getInfo());
        holder.foto.setImageResource(listaPersonajes.get(position).getFoto()); //se coloca SetImageResource cuando las imagenes se traen desde drawable
    }


    //Paso 5: realizamos el conteo de items de la lista
    @Override
    public int getItemCount() {
        return listaPersonajes.size();
    }


    //Paso 6: Hacemos que la listaPersonajes tengan referencia a los elementos del molde
    public class ViewHolderPersonajes extends RecyclerView.ViewHolder {
        TextView txtnombre, txtdescripcion;
        ImageView foto;

        public ViewHolderPersonajes(View itemView) {
            super(itemView);

            txtnombre = (TextView) itemView.findViewById(R.id.idNombre);
            txtdescripcion = (TextView) itemView.findViewById(R.id.idInfo);
            foto = (ImageView) itemView.findViewById(R.id.idImagen);
        }
    }
}
