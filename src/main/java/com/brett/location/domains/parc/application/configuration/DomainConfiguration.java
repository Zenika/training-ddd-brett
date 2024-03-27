package com.brett.location.domains.parc.application.configuration;

import com.brett.location.domains.parc.domain.ParcService;
import com.brett.location.domains.parc.infrastructure.mock.InMemoryVeloRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.naming.InitialContext;

@Configuration
public class DomainConfiguration {

    @Bean
    public ParcService buildParcService() {
        return new ParcService(new InMemoryVeloRepository());
    }
}
