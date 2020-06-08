
package controller;

import java.util.List;
import javax.servlet.annotation.WebServlet;
import metamorph.controller.BaseController;

@WebServlet("/bookinfo/*")
public class BookinfoController
    extends BaseController
{


    @metamorph.annotation.PostMethod(url = "/store")
    public void store(
        @metamorph.annotation.RequestBody
        entity.Bookinfo bookinfo) {
        dao.BookinfoDAO dao = new dao.BookinfoDAO();
        dao.save(bookinfo);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/bookinfo/show");
    }

    @metamorph.annotation.PostMethod(url = "/update")
    public void update(
        @metamorph.annotation.RequestBody
        entity.Bookinfo bookinfo) {
        dao.BookinfoDAO dao = new dao.BookinfoDAO();
        dao.update(bookinfo);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/bookinfo/show");
    }

    @metamorph.annotation.GetMethod(url = "/edit/{id}")
    public void edit(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.BookinfoDAO dao = new dao.BookinfoDAO();
        entity.Bookinfo result = dao.getById(id);
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/edit_bookinfo_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show")
    public void show() {
        dao.BookinfoDAO dao = new dao.BookinfoDAO();
        List<entity.Bookinfo> result = dao.getAll();
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/table_bookinfo_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show/{id}")
    public void showById(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.BookinfoDAO dao = new dao.BookinfoDAO();
        entity.Bookinfo result = dao.getById(id);
    }

    @metamorph.annotation.GetMethod(url = "/create")
    public void create() {
        requestResponse.forward("/page/create_bookinfo_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/delete/{id}")
    public void delete(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.BookinfoDAO dao = new dao.BookinfoDAO();
        dao.delete(id);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/bookinfo/show");
    }

}
