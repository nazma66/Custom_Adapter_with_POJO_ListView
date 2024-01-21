package com.example.custom_adapter_with_pojo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView1 =(ListView)findViewById(R.id.listview1);
        BA_CustomListAdapter_pojo_2 adapter = new BA_CustomListAdapter_pojo_2(this,generateItemsList());
        listView1.setAdapter(adapter);

    }
    private ArrayList<Item> generateItemsList() {
        String itemNames[] = {"Laptop", "Smartphone", "Headphones"};
        String itemDresciptions[] = {"Powerful laptop for work and play", "Latest smartphone with high-end features", "Premium noise-canceling headphones"};
        String itemDate[] = {"2023-01-01", "2023-02-15", "2023-03-30"};
        Integer itemPrice[] = {1200, 899, 150};
        Double itemDouble[] = {1.5, 2.3, 0.8};


        ArrayList<Item> list = new ArrayList<>();
        for (int i=0; i< itemNames.length;i++){
            list.add(new Item(itemNames[i],itemDresciptions[i] ,itemDate[i],itemPrice[i],itemDouble[i]));

        }
        return list;
    }

}