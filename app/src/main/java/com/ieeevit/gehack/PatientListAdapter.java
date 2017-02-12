package com.ieeevit.gehack;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PatientListAdapter extends RecyclerView.Adapter<PatientListAdapter.ProfileViewHolder> {

    private List<Patient> profileList;
    private int rowLayout;
    private Activity context;

    static class ProfileViewHolder extends RecyclerView.ViewHolder {
        TextView name, age;
        ImageView photo;
        CardView patient;

        ProfileViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.tv_name);
            age = (TextView) v.findViewById(R.id.tv_age);
            photo = (ImageView) v.findViewById(R.id.iv_photo);
            patient = (CardView) v.findViewById(R.id.cv_patient);
        }
    }

    public PatientListAdapter(List<Patient> profileList, int rowLayout, Activity context) {
        this.profileList = profileList;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public ProfileViewHolder onCreateViewHolder(ViewGroup parent,
                                                int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new ProfileViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ProfileViewHolder holder, final int position) {
        holder.name.setText(profileList.get(position).name);
        holder.age.setText(profileList.get(position).age);
        holder.photo.setImageResource(profileList.get(position).photo);
        holder.patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, RecordActivity.class);
                context.startActivity(intent);
            }
        });
/*        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ProfileActivity2.class);
                intent.putExtra(Consts.PROFILE_ID, profileList.get(position).id);
                context.startActivity(intent);
            }
        });*/
    }

    @Override
    public int getItemCount() {
        return profileList.size();
    }
}