package com.realestate.realestate.config;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

public interface URI {
    void configureRepositoryRestConfiguration(RepositoryRestConfiguration config);
}
