package com.example.barakatravelapp.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.barakatravelapp.R;
import com.example.barakatravelapp.data.model.GeneralResposeData;

import java.util.ArrayList;
import java.util.List;

public class DialogCenterSpinnerAdapter extends BaseAdapter {

    private Context context;
    private List<GeneralResposeData> generalResponseDataList = new ArrayList<>();
    private LayoutInflater inflter;
    public int selectedId = 0;

    public DialogCenterSpinnerAdapter(Context applicationContext) {
        this.context = applicationContext;
        this.generalResponseDataList = generalResponseDataList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    public void setData(List<GeneralResposeData> generalResponseDataList, String hint) {
        this.generalResponseDataList = new ArrayList<>();
        this.generalResponseDataList.add(new GeneralResposeData(0, hint));
        this.generalResponseDataList.addAll(generalResponseDataList);
    }

    @Override
    public int getCount() {
        return generalResponseDataList.size();
    }

    @Override
    public Object getItem(int i) {
        return generalResponseDataList.get(i).getName();
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.simple_list_item_2, null);

        TextView names = (TextView) view.findViewById(R.id.txt_spinner);

        names.setText(generalResponseDataList.get(i).getName());
        selectedId = generalResponseDataList.get(i).getId();
        if(i > 0) {
            names.setTextColor(Color.parseColor("#04B8F9"));
        }
        return view;
    }

    @Override
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.simple_list_item_2, null);

        TextView text = (TextView) view.findViewById(R.id.txt_spinner);
        text.setText(generalResponseDataList.get(i).getName());
        text.setTextColor(Color.parseColor("#04B8F9"));
        selectedId = generalResponseDataList.get(i).getId();

        return view;

    }

}
