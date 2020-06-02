
package dao;

import metamorph.dao.DAO;

public class UserDAO
    extends DAO<model.User>
{


    public UserDAO() {
        super(new model.User());
    }

}
