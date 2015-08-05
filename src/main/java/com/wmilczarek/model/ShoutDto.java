package com.wmilczarek.model;

import com.wmilczarek.entity.ShoutEntity;
import pl.jsolve.oven.annotationdriven.annotation.Map;
import pl.jsolve.oven.annotationdriven.annotation.MappableTo;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;

@MappableTo(ShoutEntity.class)
public class ShoutDto {

    @Map
    private long id;

    @Map
    private Boolean isActive = true;

    @Map
    private Long userId;

    @Map
    private LocalDateTime dateTime;

    @Map
    private String shoutComment;

    public ShoutDto(String shoutComment, LocalDateTime dateTime) {
        this.shoutComment = shoutComment;
        this.dateTime = dateTime;
    }

    public ShoutDto(String shoutComment) {
        this.shoutComment = shoutComment;
    }


    public ShoutDto() {

    }

    public void setShoutComment(String shoutComment) {
        this.shoutComment = shoutComment;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Boolean IsActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShoutComment() {
        return shoutComment;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Long getUserId() {
        return userId;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ShoutDto{" +
                "id=" + id +
                ", isActive=" + isActive +
                ", userId=" + userId +
                ", dateTime=" + dateTime +
                ", shoutComment='" + shoutComment + '\'' +
                '}';
    }
}
