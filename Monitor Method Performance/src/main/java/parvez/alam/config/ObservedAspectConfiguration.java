package parvez.alam.config;

import io.micrometer.observation.ObservationRegistry;
import io.micrometer.observation.aop.ObservedAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import parvez.alam.logger.SimpleLoggingHandler;

@Configuration
public class ObservedAspectConfiguration {

    @Bean
    public ObservedAspect observedAspect(ObservationRegistry observationRegistry) {
        observationRegistry.observationConfig().observationHandler(new SimpleLoggingHandler());

        return new ObservedAspect(observationRegistry);
    }
}