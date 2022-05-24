package com.alibaba.taobao.Dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name ="role")
public class Role {

    @Id
    @Column(name="role_id")
    @GeneratedValue
    private  Long id;

    @Column(name="role")
    private String role;

    @OneToMany(cascade = CascadeType.ALL)
    private List<User> user;

    public Role() {
    }

    public Role(Long id, String role, List<User> user) {
        this.id = id;
        this.role = role;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", user=" + user +
                '}';
    }
}
