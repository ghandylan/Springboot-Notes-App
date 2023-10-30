package com.dylan.notes.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;

    // establish a one-to-many relationship between User and Note
//    @OneToMany(mappedBy = "user")
//    private List<Note> notes;


    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
//        this.notes = notes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public List<Note> getNotes() {
//        return notes;
//    }
//
//    public void setNotes(List<Note> notes) {
//        this.notes = notes;
//    }


//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
}
