package com.ieeevit.gehack;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class RecordActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.rv_records);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Record> recordList = new ArrayList<>();
        recordList.add(new Record("28 - 11 - 2007", "3", "29.19", "1400", "45", "29", "4.3", "87", "3.4", "9.1"));
        recordList.add(new Record("05 - 12 - 2007", "4", "31.12", "1300", "12", "20", "4.3", "78", "4.6", "10.3"));
        recordList.add(new Record("12 - 12 - 2007", "5", "31.00", "900", "202", "34", "4.3", "98", "7.8", "10.1"));
        recordList.add(new Record("19 - 12 - 2007", "6", "29.19", "1400", "45", "29", "4.3", "87", "3.4", "9.1"));
        recordList.add(new Record("20 - 01 - 2008", "9", "29.19", "1400", "45", "29", "4.3", "87", "3.4", "9.1"));
        recordList.add(new Record("24 - 01 - 2008", "10", "29.19", "1400", "45", "29", "4.3", "87", "3.4", "9.1"));
        recordList.add(new Record("30 - 01 - 2009", "11", "29.19", "1400", "45", "29", "4.3", "87", "3.4", "9.1"));

        recyclerView.setAdapter(new RecordListAdapter(recordList, R.layout.item_record, this));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
