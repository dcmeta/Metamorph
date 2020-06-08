
package dao;

import metamorph.dao.DAO;

public class CartDAO
    extends DAO<entity.Cart>
{


    public CartDAO() {
        super(new entity.Cart());
    }

}
