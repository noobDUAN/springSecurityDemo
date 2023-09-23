package com.wayne.wayneBlog.entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "tb_user")
public class UserBean {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;
}
