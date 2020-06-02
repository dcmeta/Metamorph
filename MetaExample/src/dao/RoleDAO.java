
package dao;

import metamorph.dao.DAO;

public class RoleDAO
    extends DAO<model.Role>
{


    public RoleDAO() {
        super(new model.Role());
    }

}
