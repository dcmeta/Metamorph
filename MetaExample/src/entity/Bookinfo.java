
package entity;

import java.util.Date;
import metamorph.annotation.AutoGenerate;
import metamorph.annotation.Id;
import metamorph.annotation.Table;

@Table(name = "bookinfo")
public class Bookinfo {

    @Id
    @AutoGenerate
    @metamorph.annotation.Column(name = "bookid")
    private Integer bookid;
    @metamorph.annotation.Column(name = "bookname")
    private String bookname;
    @metamorph.annotation.Column(name = "bookauthor")
    private String bookauthor;
    @metamorph.annotation.Column(name = "bookpubdate")
    private Date bookpubdate;
    @metamorph.annotation.Column(name = "bookstock")
    private Integer bookstock;
    @metamorph.annotation.Column(name = "bookprice")
    private Double bookprice;
    @metamorph.annotation.Column(name = "bookurl")
    private String bookurl;

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookauthor() {
        return bookauthor;
    }

    public void setBookauthor(String bookauthor) {
        this.bookauthor = bookauthor;
    }

    public Date getBookpubdate() {
        return bookpubdate;
    }

    public void setBookpubdate(Date bookpubdate) {
        this.bookpubdate = bookpubdate;
    }

    public Integer getBookstock() {
        return bookstock;
    }

    public void setBookstock(Integer bookstock) {
        this.bookstock = bookstock;
    }

    public Double getBookprice() {
        return bookprice;
    }

    public void setBookprice(Double bookprice) {
        this.bookprice = bookprice;
    }

    public String getBookurl() {
        return bookurl;
    }

    public void setBookurl(String bookurl) {
        this.bookurl = bookurl;
    }

}
