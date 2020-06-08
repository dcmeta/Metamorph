
package controller;

import java.util.List;
import javax.servlet.annotation.WebServlet;
import metamorph.controller.BaseController;

@WebServlet("/cart/*")
public class CartController
    extends BaseController
{


    @metamorph.annotation.PostMethod(url = "/store")
    public void store(
        @metamorph.annotation.RequestBody
        entity.Cart cart) {
        dao.CartDAO dao = new dao.CartDAO();
        dao.save(cart);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/cart/show");
    }

    @metamorph.annotation.PostMethod(url = "/update")
    public void update(
        @metamorph.annotation.RequestBody
        entity.Cart cart) {
        dao.CartDAO dao = new dao.CartDAO();
        dao.update(cart);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/cart/show");
    }

    @metamorph.annotation.GetMethod(url = "/edit/{id}")
    public void edit(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.CartDAO dao = new dao.CartDAO();
        entity.Cart result = dao.getById(id);
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/edit_cart_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show")
    public void show() {
        dao.CartDAO dao = new dao.CartDAO();
        List<entity.Cart> result = dao.getAll();
        requestResponse.getRequest().setAttribute("result", result);
        requestResponse.forward("/page/table_cart_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/show/{id}")
    public void showById(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.CartDAO dao = new dao.CartDAO();
        entity.Cart result = dao.getById(id);
    }

    @metamorph.annotation.GetMethod(url = "/create")
    public void create() {
        requestResponse.forward("/page/create_cart_page.jsp");
    }

    @metamorph.annotation.GetMethod(url = "/delete/{id}")
    public void delete(
        @metamorph.annotation.URLVariable
        Integer id) {
        dao.CartDAO dao = new dao.CartDAO();
        dao.delete(id);
        String cp = requestResponse.getRequest().getContextPath();
        requestResponse.sendRedirect(cp += "/cart/show");
    }

}
