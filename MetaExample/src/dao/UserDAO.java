
package dao;

import metamorph.dao.DAO;

public class UserDAO
    extends DAO<entity.User>
{


    public UserDAO() {
        super(new entity.User());
    }

}
