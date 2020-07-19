package com.jacob.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class Swagger2Config {
    /**
     * Swagger Metadata http://localhost:8080/v2/api-docs
     * Swagger Metadata http://localhost:8080/swagger-ui.html
     * Swagger Validator https://editor.swagger.io
     * @return  A builder which is intended to be the primary interface into the Springfox framework.
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .select()
                //identity specific controller package
                .apis(RequestHandlerSelectors.basePackage("com.jacob"))
                //identity specific url mapping
                .paths(PathSelectors.ant("/**"))
                .build();
    }

    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder()
                .title("Jacob User Management Service")
                .description("This page lists all API`s of User Management")
                .version("2.0")
                .contact(new Contact("Jacob","https://github.com/15702992009","www.jacobscala@163.com"))
                .license("License 2.0")
                .licenseUrl("https://github.com/15702992009/license.html")
                .build();
    }
}
