package com.wmilczarek.model;


import java.time.ZonedDateTime;

public class SampleDto {

    private String shoutComment;

    private ZonedDateTime postDateTime;

    public SampleDto(String shoutComment) {
        this.shoutComment = shoutComment;
    }

    public SampleDto() {
    }

    public String getShoutComment() {
        return shoutComment;
    }

    public void setShoutComment(String shoutComment) {
        this.shoutComment = shoutComment;
    }

    public ZonedDateTime getPostDateTime() {
        return postDateTime;
    }

    public void setPostDateTime(ZonedDateTime postDateTime) {
        this.postDateTime = postDateTime;
    }

    @Override
    public String toString() {
        return "SampleDto{" +
                "shoutComment='" + shoutComment + '\'' +
                ", postDateTime=" + postDateTime +
                '}';
    }
}
