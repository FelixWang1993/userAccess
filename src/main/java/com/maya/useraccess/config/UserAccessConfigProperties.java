/**
 * Copyright 2017 Kingland Systems Corporation. All Rights Reserved.
 */
package com.maya.useraccess.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * A properties class mapping to application.properties. Each variable maps to a
 * key of properties file.
 *
 * @author KSC
 */
@ConfigurationProperties(ignoreUnknownFields = false, prefix = "user")
public class UserAccessConfigProperties {

    private String dbDriverClassName;
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;
    private String dbMapperxml;

    /**
     * Sqs endpoint url
     */
    private String environment;

    /**
     * @return the environment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * @param environment the environment to set
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * @return the dbDriverClassName
     */
    public String getDbDriverClassName() {
        return dbDriverClassName;
    }

    /**
     * @param dbDriverClassName the dbDriverClassName to set
     */
    public void setDbDriverClassName(String dbDriverClassName) {
        this.dbDriverClassName = dbDriverClassName;
    }

    /**
     * @return the dbUrl
     */
    public String getDbUrl() {
        return dbUrl;
    }

    /**
     * @param dbUrl the dbUrl to set
     */
    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    /**
     * @return the dbUsername
     */
    public String getDbUsername() {
        return dbUsername;
    }

    /**
     * @param dbUsername the dbUsername to set
     */
    public void setDbUsername(String dbUsername) {
        this.dbUsername = dbUsername;
    }

    /**
     * @return the dbPassword
     */
    public String getDbPassword() {
        return dbPassword;
    }

    /**
     * @param dbPassword the dbPassword to set
     */
    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    /**
     * @return the dbMapperxml
     */
    public String getDbMapperxml() {
        return dbMapperxml;
    }

    /**
     * @param dbMapperxml the dbMapperxml to set
     */
    public void setDbMapperxml(String dbMapperxml) {
        this.dbMapperxml = dbMapperxml;
    }

}