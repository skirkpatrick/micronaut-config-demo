package application;

import io.micronaut.context.ApplicationContext;
import io.micronaut.inject.qualifiers.Qualifiers;
import library.PetConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        final var context = ApplicationContext.run();

        final var configs = context.getBeansOfType(PetConfiguration.class);
        LOG.info("{} configs found", configs.size());

        final var milo = context.getBean(PetConfiguration.class, Qualifiers.byName("milo"));
        LOG.info("milo: {}, {}, {}", milo.getName(), milo.getBreed(), milo.getColor());

        final var otis = context.getBean(PetConfiguration.class, Qualifiers.byName("otis"));
        LOG.info("otis: {}, {}, {}", otis.getName(), otis.getBreed(), otis.getColor());
    }

}
