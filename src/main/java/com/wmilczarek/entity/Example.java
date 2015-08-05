package com.wmilczarek.entity;

import javax.persistence.*;

/**
 * Created by wmilczarek on 2015-04-17.
 */


@Entity
@Table(name = "example_data")
public class Example {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    public String name;
    public String alias;

    public Example() {
    }

    public Example(long id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Example{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
