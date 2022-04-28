package com.iiitb.projectmanagementsystembackend.data.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import java.util.Set;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column
    private String projectname;

    @Column
    private String description;

    @OneToMany(mappedBy = "id")
    private Set<User> users;

    @OneToMany(mappedBy = "id")
    private Set<Task> task;

    @OneToOne
    private EffortTable effortTable;

    public Project(long id, String projectname, String description, Set<User> users, Set<Task> task, EffortTable effortTable) {
        this.id = id;
        this.projectname = projectname;
        this.description = description;
        this.users = users;
        this.task = task;
        this.effortTable = effortTable;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Project(){

    }

    public Set<Task> getTask() {
        return task;
    }

    public void setTask(Set<Task> task) {
        this.task = task;
    }

    public EffortTable getEffortTable() {
        return effortTable;
    }

    public void setEffortTable(EffortTable effortTable) {
        this.effortTable = effortTable;
    }
}
