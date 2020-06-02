
package config;

import controller.RoleController;
import controller.UserController;
import metamorph.utilitycontroller.ControllerConfigurator;
import metamorph.utilitycontroller.ControllerMap;

public class MetaOControllerConfigurator
    extends ControllerConfigurator
{


    @Override
    public void config() {
        ControllerMap controllerMap = new ControllerMap();
        controllerMap.addController(RoleController.class);
        controllerMap.addController(UserController.class);
        controllerMap.process();
    }

}
