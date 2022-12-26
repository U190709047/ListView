package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ArrayAdaptorActivity extends AppCompatActivity{
    final List<Dishes> dishes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adaptor);
       dishes.add(new Dishes("Meat",R.mipmap.pzz));
       dishes.add(new Dishes("pizza",R.mipmap.pzz));
       dishes.add(new Dishes("kebab",R.mipmap.kebab));
       dishes.add(new Dishes("doner",R.mipmap.dnr));
       dishes.add(new Dishes("tantuni",R.mipmap.tnt));
       dishes.add(new Dishes("lahmacun",R.mipmap.lhmc_foreground));
       dishes.add(new Dishes("pancake",R.mipmap.pnc));
       dishes.add(new Dishes("toast",R.mipmap.tst));
       dishes.add(new Dishes("sandwich",R.mipmap.sdw));
       dishes.add(new Dishes("pasta",R.mipmap.pst));
       dishes.add(new Dishes("rice",R.mipmap.rc));
       dishes.add(new Dishes("chicken wing",R.mipmap.cw));
       dishes.add(new Dishes("pita bread",R.mipmap.pt));
       dishes.add(new Dishes("croissant",R.mipmap.meatball));
       dishes.add(new Dishes("manti",R.mipmap.mnt));
       dishes.add(new Dishes("soup",R.mipmap.soup));
       dishes.add(new Dishes("fried potatoes",R.mipmap.frs));
       dishes.add(new Dishes("horicot bean",R.mipmap.bean));
       dishes.add(new Dishes("baklava",R.mipmap.baklava));
       dishes.add(new Dishes("cake",R.mipmap.cake));
       dishes.add(new Dishes("waffle",R.mipmap.wff));
       dishes.add(new Dishes("ice cream",R.mipmap.ice));
       dishes.add(new Dishes("spangle",R.mipmap.spng));
       dishes.add(new Dishes("pudding",R.mipmap.pud));
       dishes.add(new Dishes("croissant",R.mipmap.cro));

        final ListView listView = (ListView) findViewById(R.id.listview);
        DishesAdapter adapter = new DishesAdapter(this,dishes);
        listView.setAdapter(adapter);
    }
}