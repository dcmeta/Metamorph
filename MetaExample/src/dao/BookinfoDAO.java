
package dao;

import metamorph.dao.DAO;

public class BookinfoDAO
    extends DAO<entity.Bookinfo>
{


    public BookinfoDAO() {
        super(new entity.Bookinfo());
    }

}
