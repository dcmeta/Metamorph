
package config;

import entity.Author;
import entity.Bookinfo;
import entity.Cart;
import entity.User;
import metamorph.utility.MetamorphNest;
import metamorph.utility.MetamorphStarter;

public class MetaOConfigurator
    extends MetamorphStarter
{


    @Override
    public void config() {
        MetamorphNest metaNest = new MetamorphNest();
        metaNest.addClass(Author.class);
        metaNest.addClass(Bookinfo.class);
        metaNest.addClass(Cart.class);
        metaNest.addClass(User.class);
        metaNest.process();
    }

}
