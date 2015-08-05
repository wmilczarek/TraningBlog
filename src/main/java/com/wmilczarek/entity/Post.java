package com.wmilczarek.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by wmilczarek on 2015-04-28.
 */
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long user_id;

    private boolean is_active;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public boolean isIs_active() {
        return is_active;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", is_active=" + is_active +
                '}';
    }
}
