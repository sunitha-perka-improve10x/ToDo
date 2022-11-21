package com.improve10x.todo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskListAdapter extends RecyclerView.Adapter<TaskListViewHolder> {
    public ArrayList<TaskList> taskLists;
    public  void setData (ArrayList<TaskList> TaskList) {
        taskLists = TaskList;
    }
    @NonNull
    @Override
    public TaskListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tasklist_item,parent,false);
        TaskListViewHolder taskListViewHolder = new TaskListViewHolder(view);
        return taskListViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskListViewHolder holder, int position) {
        TaskList taskList = taskLists.get(position);
        holder.titleTxt.setText(taskList.title);
        holder.messageTxt.setText(taskList.message);
    }

    @Override
    public int getItemCount() {
        return taskLists.size();
    }
}
