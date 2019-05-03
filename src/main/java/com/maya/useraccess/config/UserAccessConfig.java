/**
 * Copyright 2017 Kingland Systems Corporation. All Rights Reserved.
 */
package com.maya.useraccess.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * To initialize basic beans into container, i.e. dataSource, transactionManager, sqlSessionFaction etc.
 * It also enables basic spring functionalities for our utilization by an annotation approach in the business logic,
 * i.e. it is able to put a @Transactional in a service class to manage the transaction
 *
 * This configuration will set datasource for postgresql only
 *
 * @author KSC
 */
@Configuration
@EnableConfigurationProperties(UserAccessConfigProperties.class)
@MapperScan(
		basePackages = {"com.maya.useraccess.mapper"},
		sqlSessionFactoryRef="userSqlSessionFactory"
)
public class UserAccessConfig {

	@Autowired
	UserAccessConfigProperties configProperties;

    /**
	 * Spring container will initialize a bean whose name is dataSource.
	 *
	 * @return a DataSource instance
	 */
    @Bean(name = "userDataSource")
    @Scope(value = "singleton")
    public DataSource userDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(configProperties.getDbDriverClassName());
        ds.setUsername(configProperties.getDbUsername());
        ds.setPassword(configProperties.getDbPassword());
        ds.setUrl(configProperties.getDbUrl());

        return ds;
    }

	/**
	 * Spring container will initialize a bean whose name is sqlSessionFactory, which is from MyBatis framework
	 *
	 * @return a SqlSessionFactory instance
	 */
	@Bean(name = "userSqlSessionFactory")
	public SqlSessionFactory userSqlSessionFactory() throws Exception{

		SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
		factoryBean.setDataSource(userDataSource());

		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resolver.getResources(configProperties.getDbMapperxml());
		factoryBean.setMapperLocations(resources);

		return factoryBean.getObject();
	}

}
