package com.project.madassignment2;

public class Task {

    String task_title;
    String task_description;
    String task_due_date;
    String task_add_notes;
    String task_priority;


    public Task(String task_title,String task_description)
    {
        this.task_title = task_title;
        this.task_description = task_description;
    }

    public Task(String task_title,String task_description,String task_priority, String task_due_date)
    {
        this.task_title = task_title;
        this.task_description = task_description;
        this.task_due_date = task_due_date;
        this.task_priority = task_priority;
    }

    public String getTask_title() {
        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public String getTask_due_date() {
        return task_due_date;
    }

    public void setTask_due_date(String task_due_date) {
        this.task_due_date = task_due_date;
    }

    public String getTask_add_notes() {
        return task_add_notes;
    }

    public void setTask_add_notes(String task_add_notes) {
        this.task_add_notes = task_add_notes;
    }

    public String getTask_priority() {
        return task_priority;
    }

    public void setTask_priority(String task_priority) {
        this.task_priority = task_priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "task_title='" + task_title + '\'' +
                ", task_description='" + task_description + '\'' +
                ", task_due_date='" + task_due_date + '\'' +
                ", task_add_notes='" + task_add_notes + '\'' +
                ", task_priority='" + task_priority + '\'' +
                '}';
    }
}