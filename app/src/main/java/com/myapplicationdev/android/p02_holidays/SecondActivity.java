package com.myapplicationdev.android.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Date;

public class SecondActivity extends AppCompatActivity {

    ListView lvHolidays;
    TextView tvHoliday;
    ArrayList<Holiday> holidays;
    ArrayAdapter<Holiday> aa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lvHolidays = (ListView) this.findViewById(R.id.lvHolidays);
        tvHoliday = (TextView) findViewById(R.id.tvHoliday);
        Intent i = getIntent();
        String holiday = i.getStringExtra("Holiday");
        tvHoliday.setText(holiday);
        holidays = new ArrayList<Holiday>();
        aa = new HolidayAdapter(this, R.layout.row, holidays);
        lvHolidays.setAdapter(aa);

        holidays.add(new Holiday("New Year's Day", "1 Jan 2017"));
        holidays.add(new Holiday("Labour Day", "1 May 2017"));

        lvHolidays.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SecondActivity.this ,holidays.get(position).getHolidayName() + ": " + holidays.get(position).getDate(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
