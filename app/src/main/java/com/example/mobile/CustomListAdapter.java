package com.example.mobile;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import entities.model.Form;

import java.text.BreakIterator;
import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context; //context
    private ArrayList<Form> forms; //data source of the list adapter

    //public constructor
    public CustomListAdapter(Context context, ArrayList<Form> forms) {
        this.context = context;
        this.forms = forms;
    }

    @Override
    public int getCount() {
        return forms.size(); //returns total of items in the list
    }

    @Override
    public Object getItem(int position) {
        return forms.get(position); //returns list item at the specified position
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.activity_listview, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Form currentForm = (Form) getItem(position);
        viewHolder.FormName.setText(currentForm.getName());
        viewHolder.idDocument.setText(Integer.toString(currentForm.getDocument_id()));
        viewHolder.date.setText(currentForm.getDate().toString());
        if (currentForm.getIsRealized() == 1)
            viewHolder.isRealized.setChecked(true);
        else
            viewHolder.isRealized.setChecked(false);
        return convertView;
//        viewHolder.layoutForm.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//               goTo();
//            }
//        });


    }


    static class ViewHolder {
        TextView FormName;
        TextView idDocument;
        TextView date;
        CheckBox isRealized;
LinearLayout layoutForm;
        public ViewHolder(View view) {
            FormName = (TextView) view.findViewById(R.id.name);
            idDocument = (TextView) view.findViewById(R.id.idDocument);
            date = (TextView) view.findViewById(R.id.date);
            isRealized = (CheckBox) view.findViewById(R.id.isRealized);
            layoutForm = (LinearLayout) view.findViewById(R.id.layoutForm);
        }
    }
}