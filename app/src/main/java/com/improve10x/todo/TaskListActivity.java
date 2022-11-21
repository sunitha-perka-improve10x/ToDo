package com.improve10x.todo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class TaskListActivity extends AppCompatActivity {
    public ArrayList<TaskList> taskLists;
    public RecyclerView taskListRv;
    public TaskListAdapter taskListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);
        getSupportActionBar().setTitle("TaskList");
        handleAddBtn();
        setData();
        setupTaskListUi();

    }

    private void handleAddBtn() {
        Button addBtn = findViewById(R.id.add_btn);
        addBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,AddTaskActivity.class);
            startActivity(intent);
        });


    }

    private void setupTaskListUi() {
        taskListRv = findViewById(R.id.tasklist_rv);
        taskListRv.setLayoutManager(new LinearLayoutManager(this));
        taskListAdapter = new TaskListAdapter();
        taskListAdapter.setData(taskLists);
        taskListRv.setAdapter(taskListAdapter);
    }


    private void setData() {
        taskLists = new ArrayList<>();
        TaskList get = new TaskList();
        get.title = "Get Vegetables";
        get.message = "for 1 week";
        taskLists.add(get);

        TaskList news = new TaskList();
        news.title = "Reading News";
        news.message = "dfdadhgsfjHAGS";
        taskLists.add(news);




    }
}