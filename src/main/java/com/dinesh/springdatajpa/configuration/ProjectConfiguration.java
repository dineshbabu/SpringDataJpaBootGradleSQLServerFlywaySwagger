package com.dinesh.springdatajpa.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.dinesh.springdatajpa.audit.SecurityAuditorAware;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//@EnableTransactionManagement
@EnableJpaAuditing
public class ProjectConfiguration {

    @Autowired
    public Environment env;
    
    public void setEnv(Environment env) {
        this.env = env;
    }
    
    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer() {
        return (container -> {
            container.setPort(env.getProperty("tomcat.port", Integer.class));
            container.setContextPath(env.getProperty("tomcat.context"));
        });
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dinesh.springdatajpa"))
                .paths(PathSelectors.any())
                .build();
    }
    
    @Bean
    public AuditorAware<String> getSecurityAuditAware(){
    	return new SecurityAuditorAware();
    }
    
}
