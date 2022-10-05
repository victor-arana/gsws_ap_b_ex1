package no.data.configuration;

import no.data.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

}
