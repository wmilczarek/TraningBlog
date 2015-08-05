package com.wmilczarek.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by wmilczarek on 2015-04-28.
 */
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long user_id;

    private long post_id;

    private boolean isApproved;

    private boolean isActive;

    private String htmlBody;

    public Comment(long id, long user_id, long post_id, boolean isApproved, boolean isActive, String htmlBody) {
        this.id = id;
        this.user_id = user_id;
        this.post_id = post_id;
        this.isApproved = isApproved;
        this.isActive = isActive;
        this.htmlBody = htmlBody;
    }

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

    public long getPost_id() {
        return post_id;
    }

    public void setPost_id(long post_id) {
        this.post_id = post_id;
    }

    public boolean isApproved() {
        return isApproved;
    }

    public void setApproved(boolean isApproved) {
        this.isApproved = isApproved;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getHtmlBody() {
        return htmlBody;
    }

    public void setHtmlBody(String htmlBody) {
        this.htmlBody = htmlBody;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", post_id=" + post_id +
                ", isApproved=" + isApproved +
                ", isActive=" + isActive +
                ", htmlBody='" + htmlBody + '\'' +
                '}';
    }
}
