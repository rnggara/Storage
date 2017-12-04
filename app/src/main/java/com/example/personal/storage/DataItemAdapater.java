package com.example.personal.storage;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.personal.storage.model.DataItem;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by PERSONAL on 22/05/2017.
 */

public class DataItemAdapater extends ArrayAdapter {

    List<DataItem> mDataItems;
    LayoutInflater mInflater;
    public DataItemAdapater(Context context, List<DataItem> objects) {
        super(context, R.layout.list_item, objects);

        mDataItems = objects;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item, parent, false);
        }

        TextView tvName = (TextView) convertView.findViewById(R.id.itenNameText);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);

        DataItem item = mDataItems.get(position);

        tvName.setText(item.getItemName());
        imageView.setImageResource(R.drawable.apple_pie);

        return convertView;
    }
}
