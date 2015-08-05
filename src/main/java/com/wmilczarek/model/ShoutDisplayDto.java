package com.wmilczarek.model;

import pl.jsolve.oven.annotationdriven.annotation.Map;
import pl.jsolve.oven.annotationdriven.annotation.MappableTo;

import java.time.LocalDateTime;


public class ShoutDisplayDto {

    private String userNick;

    private String dateTime;

    private String shoutComment;

    public ShoutDisplayDto(String userNick, String dateTime, String shoutComment) {
        this.userNick = userNick;
        this.dateTime = dateTime;
        this.shoutComment = shoutComment;
    }
}
