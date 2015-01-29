package com.hqit.jd;

import javax.servlet.Filter;
import javax.sql.DataSource;

import net.bull.javamelody.MonitoringFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

import com.jolbox.bonecp.BoneCPDataSource;

@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan
@EnableAsync
public class Main 
{
	@Autowired
    private Constant constant;
	
	public static void main(String[] args)
    {
        SpringApplication.run(Main.class, args);
    }
    
    @Bean()
    public DataSource dataSource()
    {
    	BoneCPDataSource dataSource = new BoneCPDataSource();
        dataSource.setDriverClass(constant.driverClass);
        dataSource.setJdbcUrl(constant.jdbcUrl);
        dataSource.setUsername(constant.jdbcUsername);
        dataSource.setPassword(constant.jdbcPassword);
        dataSource.setIdleConnectionTestPeriodInMinutes(constant.idleConnectionTestPeriodInMinutes);
        dataSource.setIdleMaxAgeInMinutes(constant.idleMaxAgeInMinutes);
        dataSource.setMaxConnectionsPerPartition(constant.maxConnectionsPerPartition);
        dataSource.setMinConnectionsPerPartition(constant.minConnectionsPerPartition);
        dataSource.setPartitionCount(constant.partitionCount);
        dataSource.setAcquireIncrement(constant.acquireIncrement);
        dataSource.setStatementsCacheSize(constant.statementsCacheSize);
        return dataSource;
    }
    
    /**
     * 添加javamelody过滤器
     * 访问路径为：/monitoring
     * @return
     */
    @Bean
    public FilterRegistrationBean filterRegistrationBean() 
    {
        Filter javaMelodyFilter = new MonitoringFilter();
        FilterRegistrationBean javaMelodyFilterBean = new FilterRegistrationBean(javaMelodyFilter);
        javaMelodyFilterBean.addServletNames("monitoring");
        javaMelodyFilterBean.addUrlPatterns("/*");
        return javaMelodyFilterBean;
    }
}
