package com.project.madassignment2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter<TaskAdapter.viewHolder> {

    ArrayList<Task> tasks;
    Context context;


    public TaskAdapter(Context context, ArrayList<Task> list)
    {

        this.context=context;
        tasks=list;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView t_title, t_desc;
        ConstraintLayout layout_list;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            t_title = itemView.findViewById(R.id.tiltle_txt);
            t_desc = itemView.findViewById(R.id.desc_txt);
            layout_list=itemView.findViewById(R.id.layout_list);
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    Intent intent = new Intent(itemView.getContext(), NewTask_Input.class);
//                    itemView.getContext().startActivity(intent);
//                }
//            });
        }
    }



    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.list_item,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.t_title.setText(tasks.get(position).getTask_title());
        holder.t_desc.setText(tasks.get(position).getTask_description());

//holder.layout_list.setOnClickListener(v -> {
//
//    Intent intent = new Intent(holder.itemView.getContext(), NewTask_Input.class);
//    holder.itemView.getContext().startActivity(intent);
//});
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
