
package entity;

import metamorph.annotation.AutoGenerate;
import metamorph.annotation.Id;
import metamorph.annotation.Table;

@Table(name = "user")
public class User {

    @Id
    @AutoGenerate
    @metamorph.annotation.Column(name = "id")
    private Integer id;
    @metamorph.annotation.Column(name = "username")
    private String username;
    @metamorph.annotation.Column(name = "userpass")
    private String userpass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpass() {
        return userpass;
    }

    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

}
