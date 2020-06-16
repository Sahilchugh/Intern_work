package com.example.e_code.ui.slideshow;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.e_code.R;
import com.example.e_code.pdf;
import com.example.e_code.pdf_format;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {

    Context context;
    ArrayList<pdf> pdfArrayList;
    LayoutInflater layoutInflater;
    Activity activity;

    public ListAdapter(Context context, ArrayList<pdf> pdfArrayList, Activity activity) {
        this.context = context;
        this.pdfArrayList = pdfArrayList;
        layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return pdfArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return pdfArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        convertView=layoutInflater.inflate(R.layout.listview,null);
        TextView name = convertView.findViewById(R.id.textView);
        Button button = convertView.findViewById(R.id.button);
        name.setText(pdfArrayList.get(position).getName());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, pdf_format.class);
                intent.putExtra("url",pdfArrayList.get(position).getUrl());
                activity.startActivity(intent);
            }
        });
        return convertView;
    }
}
