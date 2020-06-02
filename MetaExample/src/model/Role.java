
package model;

import java.util.Date;
import metamorph.annotation.AutoGenerate;
import metamorph.annotation.Id;
import metamorph.annotation.Table;

@Table(name = "role")
public class Role {

    @Id
    @AutoGenerate
    @metamorph.annotation.Column(name = "role_id")
    private Integer roleId;
    @metamorph.annotation.Column(name = "role_name")
    private String roleName;
    @metamorph.annotation.Column(name = "created_at")
    @metamorph.annotation.Timestamp(name = "create")
    private Date createdAt;
    @metamorph.annotation.Column(name = "updated_at")
    @metamorph.annotation.Timestamp(name = "update")
    private Date updatedAt;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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
