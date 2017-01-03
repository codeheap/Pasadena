package ch.froorider.cheesecakefactory_swarm;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.config.logging.Level;
import org.wildfly.swarm.jaxrs.JAXRSArchive;
import org.wildfly.swarm.logging.LoggingFraction;

public class Application {

    public static void main(String... args) throws Exception {

        Swarm swarm = new Swarm();
        Level logLevel = Level.INFO;
        swarm.fraction(new LoggingFraction()
                .formatter("PATTERN", "%d{yyyy-MM-dd HH:mm:ss,SSS} %-5p [%c] (%t) %s%e%n")
                .consoleHandler(logLevel, "PATTERN")
                .rootLogger(logLevel, "CONSOLE"));
        JAXRSArchive deployment = ShrinkWrap.create(JAXRSArchive.class);
        deployment.addAllDependencies();
        swarm.start().deploy(deployment);

    }
}