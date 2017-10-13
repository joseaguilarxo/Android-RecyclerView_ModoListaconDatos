package com.joseaguilar.recyclerview_personalizado;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.joseaguilar.recyclerview_personalizado.Adapters.AdapterPersonajes;
import com.joseaguilar.recyclerview_personalizado.Clases.Personajes;

import java.util.ArrayList;
//EL ORDEN PARA DESARROLLAR ESTE PROYECTO ES: CLASE -> ADAPTER -> MAINACTIVITY

public class MainActivity extends AppCompatActivity {

    //Paso 1: creamos arraylist
    ArrayList<Personajes> listaPersonajes;
    //Paso 2: referenciamos a nuestro recyclerview
    RecyclerView recyclerPersonajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Paso 3: instanciamos a la lista personajes
        listaPersonajes = new ArrayList<>();
        //Paso 4: vinculamos referencia de nuestro recyclerview
        recyclerPersonajes = (RecyclerView) findViewById(R.id.RecyclerId);
        //Paso 5: establecemos formato de nuestro recycler
        recyclerPersonajes.setLayoutManager(new LinearLayoutManager(this));

        //Paso 6: creamos metodo de llenarimagenes para que se encargue de alimentar las fotos de la lista
        llenarPersonajes();

        //Paso 8: enviamos lista de imagenes al adaptador
        AdapterPersonajes adapter = new AdapterPersonajes(listaPersonajes);
        //Paso 9: enviamos el adapter creado a nuestro recyclerview
        recyclerPersonajes.setAdapter(adapter);
    }

    //Paso 7: Agregamos nustro y descripcion para las fotos --> ("nombre","descripcion",R.drawable.imagen);
    private void llenarPersonajes() {
        listaPersonajes.add(new Personajes("Bart", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen", R.drawable.bart));
        listaPersonajes.add(new Personajes("Mr. Burns", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen", R.drawable.burns));
        listaPersonajes.add(new Personajes("Flanders", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen", R.drawable.flanders));
        listaPersonajes.add(new Personajes("Homero", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen", R.drawable.homero));
        listaPersonajes.add(new Personajes("Krusty", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen", R.drawable.krusti));
        listaPersonajes.add(new Personajes("Lisa", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen", R.drawable.lisa));
        listaPersonajes.add(new Personajes("Magie", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen", R.drawable.magie));
        listaPersonajes.add(new Personajes("Marge", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen", R.drawable.marge));
        listaPersonajes.add(new Personajes("Milhouse", "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen", R.drawable.milhouse));
    }
}
