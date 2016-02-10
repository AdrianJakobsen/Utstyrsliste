package com.example.adrian.utstyrsliste;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by adrian on 04.02.16.
 */
public class EquipmentAdapter extends ArrayAdapter<Equipment> {

    int resource;
    ArrayList<Equipment> equipmentsList;

    public EquipmentAdapter(Context context, int resource, ArrayList<Equipment> equipmentsList) {//resource ????
        super(context, resource, equipmentsList);
        this.resource = resource;
        this.equipmentsList = equipmentsList;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LinearLayout equipmentView;

        Equipment item = getItem(position);

         if(convertView==null){
             equipmentView = new LinearLayout(getContext());
             String inflater = Context.LAYOUT_INFLATER_SERVICE;
             LayoutInflater lInflater = (LayoutInflater)getContext().getSystemService(inflater);
             convertView = lInflater.inflate(resource, equipmentView, true);
         }else{
             equipmentView = (LinearLayout) convertView;
         }

        if(item != null) {
            TextView itnoView = (TextView) equipmentView.findViewById(R.id.item_no);
            TextView typeNoView = (TextView) equipmentView.findViewById(R.id.type_no);
            TextView brandView = (TextView) equipmentView.findViewById(R.id.brand);
            TextView modelView = (TextView) equipmentView.findViewById(R.id.model);

        }
        return convertView;
    }


    public ArrayList<Equipment> getEquipmentsList(){
        return equipmentsList;
    }

    public void setEquipmentsList(ArrayList<Equipment> equipmentsList){
        this.equipmentsList = equipmentsList;
    }
}
