
package entity;

import java.util.Date;
import metamorph.annotation.AutoGenerate;
import metamorph.annotation.ForeignKey;
import metamorph.annotation.Id;
import metamorph.annotation.Table;

@Table(name = "user")
public class User {

    @Id
    @AutoGenerate
    @metamorph.annotation.Column(name = "user_id")
    private Integer userId;
    @metamorph.annotation.Column(name = "username")
    private String username;
    @metamorph.annotation.Column(name = "password")
    private String password;
    @ForeignKey(table_reference = "role", reference_column = "role_id", column = "role_id", class_reference = Role.class)
    private entity.Role roleId;
    @metamorph.annotation.Column(name = "created_at")
    @metamorph.annotation.Timestamp(name = "create")
    private Date createdAt;
    @metamorph.annotation.Column(name = "updated_at")
    @metamorph.annotation.Timestamp(name = "update")
    private Date updatedAt;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public entity.Role getRoleId() {
        return roleId;
    }

    public void setRoleId(entity.Role roleId) {
        this.roleId = roleId;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
