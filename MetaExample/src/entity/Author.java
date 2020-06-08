
package entity;

import metamorph.annotation.AutoGenerate;
import metamorph.annotation.Id;
import metamorph.annotation.Table;

@Table(name = "author")
public class Author {

    @Id
    @AutoGenerate
    @metamorph.annotation.Column(name = "id")
    private Integer id;
    @metamorph.annotation.Column(name = "authorname")
    private String authorname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

}
