package com.example.firebase_child_node;

public class dataholder
{
    String name,course, duration;

    public dataholder(String name, String course, String duration) {
        this.name = name;
        this.course = course;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    //----end----
}
