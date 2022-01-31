package com.realestate.realestate.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;


@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer, RepositoryConfiguration {

	@Autowired
	private static EntityManager entityManager;
    public static class URI implements com.realestate.realestate.config.URI {

        public java.net.URI getBaseUri() {
            return null;
        }

        @Override
        public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

            config.exposeIdsFor(entityManager.getMetamodel().getEntities().stream()
                    .map(Type::getJavaType)
                    .toArray(Class[]::new));
           // RepositoryRestConfiguration getBaseUri = new RepositoryRestConfiguration();
            //config.getBaseUri(getBaseUri)
            //        .RepositoryRestConfiguration()
            //        .allowedOrigins("http://localhost:4200");
        }
    }
}
