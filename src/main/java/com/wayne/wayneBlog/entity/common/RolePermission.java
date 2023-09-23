package com.wayne.wayneBlog.entity.common;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "role_permission")
public class RolePermission {

    @Id
    private long id;
    private long roleId;
    private long permissionId;
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


    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }


    public long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(long permissionId) {
        this.permissionId = permissionId;
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
