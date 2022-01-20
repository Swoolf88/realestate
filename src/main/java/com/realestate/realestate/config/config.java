package com.realestate.realestate.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

public interface config extends RepositoryRestConfigurer {
    void configureRepositoryRestConfiguration(RepositoryRestConfiguration config);
}
