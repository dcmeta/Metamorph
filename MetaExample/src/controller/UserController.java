
package controller;

import java.util.List;
import javax.servlet.annotation.WebServlet;
import metamorph.controller.BaseController;

@WebServlet("/user/*")
public class UserController
    extends BaseController
{


    @metamorph.annotation.PostMethod(url = "/store")
    public void store(
        @metamorph.annotation.RequestBody
        entity.User user) {
        dao.UserDAO dao = new dao.UserDAO();
        dao.save(user);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/user/show");
    }

    @metamorph.annotation.PostMethod(url = "/update")
    public void update(
        @metamorph.annotation.RequestBody
        entity.User user) {
        dao.UserDAO dao = new dao.UserDAO();
        dao.update(user);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/user/show");
    }

    @metamorph.annotation.GetMethod(url = "/edit/{id}")
    public void edit(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.UserDAO dao = new dao.UserDAO();
        entity.User result = dao.getById(id);
        dao.RoleDAO roleDAO = new dao.RoleDAO();
        List<entity.Role> role = roleDAO.getAll();
        requestResponse.getRequest().setAttribute("role", role);
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/edit_user_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show")
    public void show() {
        dao.UserDAO dao = new dao.UserDAO();
        List<entity.User> result = dao.getAll();
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/table_user_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show/{id}")
    public void showById(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.UserDAO dao = new dao.UserDAO();
        entity.User result = dao.getById(id);
    }

    @metamorph.annotation.GetMethod(url = "/create")
    public void create() {
        dao.RoleDAO roleDAO = new dao.RoleDAO();
        List<entity.Role> role = roleDAO.getAll();
        requestResponse.getRequest().setAttribute("role", role);
        requestResponse.forward("/page/create_user_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/delete/{id}")
    public void delete(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.UserDAO dao = new dao.UserDAO();
        dao.delete(id);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/user/show");
    }

}
