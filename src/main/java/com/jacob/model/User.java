package com.jacob.model;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * <dependency>
 * * <groupId>javax.validation</groupId>
 * * <artifactId>validation-api</artifactId>
 * * <version>2.0.1.Final</version>
 * * </dependency>
 */
public class User {
    @ApiModelProperty(notes = " Auto generated unique id", required = true, position = 1)
    private Integer id;

    @ApiModelProperty(notes = "username should be in format jacob", example = "jacob", required = true, position = 2)
    @Size(min = 2, max = 50)
    @NotEmpty(message = "Username is Mandatory field. Please provide username")
    private String username;

    @ApiModelProperty(notes = " password size must >6 and <12 ", required = true, position = 3)
    @Size(min = 6, max = 12)
    @NotEmpty(message = "Password is Mandatory field. Please provide password")
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
