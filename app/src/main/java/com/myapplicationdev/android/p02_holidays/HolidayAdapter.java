package com.myapplicationdev.android.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {

    private Context context;
    private ArrayList<Holiday> holidays;
    private TextView tv, tv2;
    private ImageView imageView;


    public HolidayAdapter(Context context,int resource , ArrayList<Holiday> objects){
        super(context,resource,objects);
        holidays = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parent,false);
        tv = (TextView)rowView.findViewById(R.id.textView);
        tv2 = (TextView)rowView.findViewById(R.id.textView2);
        imageView = (ImageView)rowView.findViewById(R.id.imageView);
        Holiday currentHoliday = holidays.get(position);
        tv.setText(currentHoliday.getHolidayName());

        if(currentHoliday.getHolidayName() == "New Year's Day"){
            imageView.setImageResource(R.drawable.new_year);
            tv2.setText(currentHoliday.getDate().toString());
        }else if(currentHoliday.getHolidayName() == "Labour Day"){
            imageView.setImageResource(R.drawable.labour_day);
            tv2.setText(currentHoliday.getDate().toString());
        }else if(currentHoliday.getHolidayName() == "Chinese New Year"){
            imageView.setImageResource(R.drawable.cny);
            tv2.setText(currentHoliday.getDate().toString());
        }else if(currentHoliday.getHolidayName() == "Hari Raya Puasa"){
            imageView.setImageResource(R.drawable.hari_raya_puasa);
            tv2.setText(currentHoliday.getDate().toString());
        }else if(currentHoliday.getHolidayName() == "Hari Raya Haji"){
            imageView.setImageResource(R.drawable.hari_raya_haji);
            tv2.setText(currentHoliday.getDate().toString());
        }else if(currentHoliday.getHolidayName() == "Deepavali"){
            imageView.setImageResource(R.drawable.deepavali);
            tv2.setText(currentHoliday.getDate().toString());
        }else {
            imageView.setImageResource(R.drawable.good_friday);
            tv2.setText(currentHoliday.getDate().toString());
        }
        return rowView;

    }

}
