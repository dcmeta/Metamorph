
package controller;

import java.util.List;
import javax.servlet.annotation.WebServlet;
import metamorph.controller.BaseController;

@WebServlet("/author/*")
public class AuthorController
    extends BaseController
{


    @metamorph.annotation.PostMethod(url = "/store")
    public void store(
        @metamorph.annotation.RequestBody
        entity.Author author) {
        dao.AuthorDAO dao = new dao.AuthorDAO();
        dao.save(author);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/author/show");
    }

    @metamorph.annotation.PostMethod(url = "/update")
    public void update(
        @metamorph.annotation.RequestBody
        entity.Author author) {
        dao.AuthorDAO dao = new dao.AuthorDAO();
        dao.update(author);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/author/show");
    }

    @metamorph.annotation.GetMethod(url = "/edit/{id}")
    public void edit(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.AuthorDAO dao = new dao.AuthorDAO();
        entity.Author result = dao.getById(id);
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/edit_author_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show")
    public void show() {
        dao.AuthorDAO dao = new dao.AuthorDAO();
        List<entity.Author> result = dao.getAll();
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/table_author_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show/{id}")
    public void showById(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.AuthorDAO dao = new dao.AuthorDAO();
        entity.Author result = dao.getById(id);
    }

    @metamorph.annotation.GetMethod(url = "/create")
    public void create() {
        requestResponse.forward("/page/create_author_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/delete/{id}")
    public void delete(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.AuthorDAO dao = new dao.AuthorDAO();
        dao.delete(id);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/author/show");
    }

}
