package com.example.personal.storage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.personal.storage.model.DataItem;
import com.example.personal.storage.sample.SampleDataProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    TextView tvOut;
    List<DataItem> dataItemList = SampleDataProvider.dataItemList;
    List<String> itemNames = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*DataItem item =
                new DataItem(null, "My menu item", "a category",
                        "a description", 1, 9.95, "apple_pie.jpg");*/

//        tvOut = (TextView) findViewById(R.id.out);
//        tvOut.setText("");
//
        Collections.sort(dataItemList, new Comparator<DataItem>() {
            @Override
            public int compare(DataItem o1, DataItem o2) {
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });

//        for (DataItem item : dataItemList){
////            tvOut.append(item.getItemName() + "\n");
//            itemNames.add(item.getItemName());
//        }
//
//        Collections.sort(itemNames);
//
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
//                this, android.R.layout.simple_list_item_1, itemNames
//        );
        DataItemAdapater adapter = new DataItemAdapater(this, dataItemList);
        ListView listView = (ListView) findViewById(android.R.id.list);
        listView.setAdapter(adapter);
    }


}
