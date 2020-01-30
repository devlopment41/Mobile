package com.example.mobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;
import entities.model.Doctor;
import entities.model.Form;

import java.util.ArrayList;

public class CustomListDoctorAdapter extends BaseAdapter {
    private Context context; //context
    private ArrayList<Doctor> doctors; //data source of the list adapter

    //public constructor
    public CustomListDoctorAdapter(Context context, ArrayList<Doctor> d) {
        this.context = context;
        this.doctors = d;
    }


    public int getCount() {
        return doctors.size(); //returns total of items in the list
    }


    public Object getItem(int position) {
        return doctors.get(position); //returns list item at the specified position
    }


    public long getItemId(int position) {
        return position;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        CustomListDoctorAdapter.ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_listview_doctors, parent, false);
            viewHolder = new CustomListDoctorAdapter.ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (CustomListDoctorAdapter.ViewHolder) convertView.getTag();
        }

        Doctor currentDoctor = (Doctor) getItem(position);
        viewHolder.dName.setText(currentDoctor.getName());
        viewHolder.serviceArea.setText(currentDoctor.getField_treatment());
//        viewHolder.date1.setText(currentDoctor.getAddress());

        return convertView;
    }

    private class ViewHolder {
        TextView dName;
        TextView serviceArea;
        TextView date1;

        public ViewHolder(View view) {
            dName = (TextView) view.findViewById(R.id.dName);
            serviceArea = (TextView) view.findViewById(R.id.serviceArea);
//            date1 = (TextView) view.findViewById(R.id.date1);

        }
    }
}
