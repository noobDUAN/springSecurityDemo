package com.wayne.springsecuritydemo.entity.common;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "permission")
public class Permission {

    @Id
    private long id;
    private long parentId;
    private String code;
    private String name;
    private String intro;
    private long category;
    private long uri;
    private java.sql.Timestamp created;
    private String creator;
    private java.sql.Timestamp edited;
    private String editor;
    private long deleted;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }


    public long getCategory() {
        return category;
    }

    public void setCategory(long category) {
        this.category = category;
    }


    public long getUri() {
        return uri;
    }

    public void setUri(long uri) {
        this.uri = uri;
    }


    public java.sql.Timestamp getCreated() {
        return created;
    }

    public void setCreated(java.sql.Timestamp created) {
        this.created = created;
    }


    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }


    public java.sql.Timestamp getEdited() {
        return edited;
    }

    public void setEdited(java.sql.Timestamp edited) {
        this.edited = edited;
    }


    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }


    public long getDeleted() {
        return deleted;
    }

    public void setDeleted(long deleted) {
        this.deleted = deleted;
    }

}
