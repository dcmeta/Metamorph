
package controller;

import java.util.List;
import javax.servlet.annotation.WebServlet;
import metamorph.controller.BaseController;

@WebServlet("/role/*")
public class RoleController
    extends BaseController
{


    @metamorph.annotation.PostMethod(url = "/store")
    public void store(
        @metamorph.annotation.RequestBody
        model.Role role) {
        dao.RoleDAO dao = new dao.RoleDAO();
        dao.save(role);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/role/show");
    }

    @metamorph.annotation.PostMethod(url = "/update")
    public void update(
        @metamorph.annotation.RequestBody
        model.Role role) {
        dao.RoleDAO dao = new dao.RoleDAO();
        dao.update(role);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/role/show");
    }

    @metamorph.annotation.GetMethod(url = "/edit/{id}")
    public void edit(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.RoleDAO dao = new dao.RoleDAO();
        model.Role result = dao.getById(id);
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/edit_role_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show")
    public void show() {
        dao.RoleDAO dao = new dao.RoleDAO();
        List<model.Role> result = dao.getAll();
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/table_role_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show/{id}")
    public void showById(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.RoleDAO dao = new dao.RoleDAO();
        model.Role result = dao.getById(id);
    }

    @metamorph.annotation.GetMethod(url = "/create")
    public void create() {
        requestResponse.forward("/page/create_role_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/delete/{id}")
    public void delete(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.RoleDAO dao = new dao.RoleDAO();
        dao.delete(id);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/role/show");
    }

}
