
package dao;

import metamorph.dao.DAO;

public class RoleDAO
    extends DAO<entity.Role>
{


    public RoleDAO() {
        super(new entity.Role());
    }

}
