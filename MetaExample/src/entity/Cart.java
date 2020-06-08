
package entity;

import metamorph.annotation.AutoGenerate;
import metamorph.annotation.Id;
import metamorph.annotation.Table;

@Table(name = "cart")
public class Cart {

    @Id
    @AutoGenerate
    @metamorph.annotation.Column(name = "id")
    private Integer id;
    @metamorph.annotation.Column(name = "book_name")
    private String bookName;
    @metamorph.annotation.Column(name = "book_id")
    private Integer bookId;
    @metamorph.annotation.Column(name = "num")
    private Integer num;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

}
