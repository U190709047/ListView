package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ArrayAdaptorActivity extends ListActivity{

    static final String[] ANIMALS = new String[]{"Ant","Bear","Bird","Cat","Dog","Elephant","Giraffe",
            "Goat","Mouse","Monkey","Pig","Snake","Spider"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_array_adaptor);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_array_adaptor,ANIMALS));

        ListView listView = getListView();
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                Toast.makeText(getApplicationContext(),
                        ((TextView) view).getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }

}