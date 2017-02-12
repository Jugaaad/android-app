package com.ieeevit.gehack;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class RecordListAdapter extends RecyclerView.Adapter<RecordListAdapter.RecordViewHolder> {

    private List<Record> recordList;
    private int rowLayout;
    private Activity context;

    static class RecordViewHolder extends RecyclerView.ViewHolder {
        TextView date, week, glucose, iron, folates;

        RecordViewHolder(View v) {
            super(v);
            date = (TextView) v.findViewById(R.id.tv_date);
            week = (TextView) v.findViewById(R.id.tv_week);
            glucose = (TextView) v.findViewById(R.id.tv_glucose);
            iron = (TextView) v.findViewById(R.id.tv_iron);
            folates = (TextView) v.findViewById(R.id.tv_folates);
        }
    }

    public RecordListAdapter(List<Record> recordList, int rowLayout, Activity context) {
        this.recordList = recordList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public RecordViewHolder onCreateViewHolder(ViewGroup parent,
                                               int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new RecordViewHolder(view);
    }


    @Override
    public void onBindViewHolder(RecordViewHolder holder, final int position) {
        holder.date.setText("Date: " + recordList.get(position).date);
        holder.iron.setText("Iron: " + recordList.get(position).iron);
        holder.folates.setText("Folates: " + recordList.get(position).folates);
        holder.week.setText("Week: " + recordList.get(position).week);
        holder.glucose.setText("Glucose: " + recordList.get(position).glucose);
    }

    @Override
    public int getItemCount() {
        return recordList.size();
    }
}