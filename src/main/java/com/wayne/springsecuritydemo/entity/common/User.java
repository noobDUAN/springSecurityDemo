package com.wayne.springsecuritydemo.entity.common;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    private long id;
    private long state;
    private String name;
    private String headImgUrl;
    private String mobile;
    private String salt;
    private String password;
    private java.sql.Timestamp created;
    private String creator;
    private java.sql.Timestamp edited;
    private String editor;
    private long deleted;

}
