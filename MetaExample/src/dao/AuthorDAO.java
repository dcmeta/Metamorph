
package dao;

import metamorph.dao.DAO;

public class AuthorDAO
    extends DAO<entity.Author>
{


    public AuthorDAO() {
        super(new entity.Author());
    }

}
