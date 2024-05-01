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
    private MyClickListner myClickListner;

    public void onMyClickListener(MyClickListner myClickListner){
        this.myClickListner=myClickListner;
    }

    public interface ItemSelected
    {
        void onItemClicked(int index);
    }

    List_Task.ItemSelected myActivity;


    public TaskAdapter(Context context, ArrayList<Task> list)
    {

        this.context=context;
        tasks=list;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView t_title, t_desc,t_date,t_priority;
        public  MyClickListner myClickListner;


        ConstraintLayout layout_list;
        public viewHolder(@NonNull View itemView) {
            super(itemView);

            if (myClickListner != null) {
                myClickListner.myClick(itemView, getAdapterPosition());
            } else {
                // Handle the case when myClickListner is null
                // For example, you could log a message or display a toast
                Toast.makeText(itemView.getContext(), "MyClickListner is null", Toast.LENGTH_SHORT).show();
            } t_title = itemView.findViewById(R.id.tiltle_txt);
            t_desc = itemView.findViewById(R.id.desc_txt);
            t_priority = itemView.findViewById(R.id.pri_Txt);
            t_date = itemView.findViewById(R.id.due_dateTxt);
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
        holder.t_priority.setText(tasks.get(position).getTask_priority());
        holder.t_desc.setText(tasks.get(position).getTask_description());
        holder.t_date.setText(tasks.get(position).getTask_due_date());

holder.layout_list.setOnClickListener(v -> {

    myActivity.onItemClicked(position);
//    Intent intent = new Intent(holder.itemView.getContext(), NewTask_Input.class);
//    holder.itemView.getContext().startActivity(intent);
});
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
