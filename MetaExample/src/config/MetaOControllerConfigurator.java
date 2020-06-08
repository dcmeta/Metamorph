
package config;

import controller.AuthorController;
import controller.BookinfoController;
import controller.CartController;
import controller.UserController;
import metamorph.utilitycontroller.ControllerConfigurator;
import metamorph.utilitycontroller.ControllerMap;

public class MetaOControllerConfigurator
    extends ControllerConfigurator
{


    @Override
    public void config() {
        ControllerMap controllerMap = new ControllerMap();
        controllerMap.addController(AuthorController.class);
        controllerMap.addController(BookinfoController.class);
        controllerMap.addController(CartController.class);
        controllerMap.addController(UserController.class);
        controllerMap.process();
    }

}
