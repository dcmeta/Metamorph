
package config;

import entity.Role;
import entity.User;
import metamorph.utility.MetamorphNest;
import metamorph.utility.MetamorphStarter;

public class MetaOConfigurator
    extends MetamorphStarter
{


    @Override
    public void config() {
        MetamorphNest metaNest = new MetamorphNest();
        metaNest.addClass(Role.class);
        metaNest.addClass(User.class);
        metaNest.process();
    }

}
