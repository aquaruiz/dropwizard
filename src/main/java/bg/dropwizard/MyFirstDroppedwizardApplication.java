package bg.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class MyFirstDroppedwizardApplication extends Application<MyFirstDroppedwizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new MyFirstDroppedwizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "My First Dropped wizard";
    }

    @Override
    public void initialize(final Bootstrap<MyFirstDroppedwizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final MyFirstDroppedwizardConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
