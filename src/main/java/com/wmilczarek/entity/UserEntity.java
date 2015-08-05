package com.wmilczarek.entity;

import com.wmilczarek.model.Roles;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String login;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Roles role;

    public UserEntity() {
    }

    public UserEntity(String login, String email, String password, Roles role) {
        this.login = login;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}

