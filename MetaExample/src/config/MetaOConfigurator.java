
package config;

import metamorph.utility.MetamorphNest;
import metamorph.utility.MetamorphStarter;
import model.Role;
import model.User;

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
