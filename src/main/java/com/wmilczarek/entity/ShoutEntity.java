package com.wmilczarek.entity;

import com.wmilczarek.model.ShoutDto;
import pl.jsolve.oven.annotationdriven.annotation.Map;
import pl.jsolve.oven.annotationdriven.annotation.MappableTo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;


@Entity
@Table(name = "shouts")
@MappableTo(ShoutDto.class)
public class ShoutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Map
    @NotNull
    @Column(name = "is_active")
    private Boolean isActive;

    @Map
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="user_id",insertable=false,updatable=false)
    private UserEntity userEntity;

    @Map
    @Column(name = "date_time")
    private LocalDateTime dateTime;

    @Map
    @NotNull
    @Column(name = "shout_comment")
    private String shoutComment;

    public ShoutEntity(Boolean isActive, LocalDateTime dateTime, String shoutComment) {
        this.isActive = isActive;
        this.dateTime = dateTime;
        this.shoutComment = shoutComment;
    }

    public ShoutEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public boolean isIs_active() {
        return isActive;
    }

    public void setIs_active(boolean isActive) {
        this.isActive = isActive;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getShoutComment() {
        return shoutComment;
    }

    public void setShoutComment(String shoutComment) {
        this.shoutComment = shoutComment;
    }

    @Override
    public String toString() {
        return "Shout{" +
                "id=" + id +
                ", is_active=" + isActive +
                ", user_id=" + userEntity +
                '}';
    }
}
