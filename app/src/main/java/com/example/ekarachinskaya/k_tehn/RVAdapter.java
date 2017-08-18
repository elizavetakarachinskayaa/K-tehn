package com.example.ekarachinskaya.k_tehn;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ekarachinskaya on 18.08.2017.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

    public static class PersonViewHolder extends RecyclerView.ViewHolder {
//используем макет CardView из content_main2
        //инициализируем представления к элементам RecyclerView
        CardView cv;
        TextView personName;
        TextView personDol;
        ImageView personPhoto;
       // Button personCall;


        //Находим по id  наши данные из CardView
        PersonViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            personName = (TextView)itemView.findViewById(R.id.person_name);
            personDol = (TextView)itemView.findViewById(R.id.person_dol);
            personPhoto = (ImageView)itemView.findViewById(R.id.person_photo);
//            personCall = (Button)itemView.findViewById(R.id.call);
//
//            personCall.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent dealIntent = new Intent(Intent.ACTION_DIAL);
//                    dealIntent.setData(Uri.parse("tel:12345567"));
//
//                }
//            });

        }
    }

//добавляем пользовательский адаптер, чтобы он имел доступ к данным. так как наши данные представлены в виде объектов List of Person
    List<Person> persons;

    RVAdapter(List<Person> persons){
        this.persons = persons;
    }
//RecyclerAdapter имеет 3 абстрактных метода:

    //получаем данные из RecyclerView
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    //Метод для инициаизации пользовательского ViewHolder
    //Указываем, какой макет должен использоваться для отображения каждого элемента REcyclerView
    //'Раздуваем' компановки с помощью LayoutInflater, который передает результат ViewHolder
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.content_main2, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;
    }

    //Метод для указания содержимого каждого элемента RecyclerView. Данные из CardView
    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        personViewHolder.personName.setText(persons.get(i).name);
        personViewHolder.personDol.setText(persons.get(i).dol);
        personViewHolder.personPhoto.setImageResource(persons.get(i).photoId);
       // personViewHolder.personCall.setOnClickListener();



    }

    //возвращает кол-во элементов, которые должны отображаться компонентом RecyclerView.Но т.к. у нас List, то назначим мето size()
    @Override
    public int getItemCount() {
        return persons.size();
    }


}