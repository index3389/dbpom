package com.hqit.jd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ly on 2015-01-28
 */
@Component
public class Constant 
{
    /*bonecp 的数据源配置 start*/
    @Value("${bonecp.url}")
    public String jdbcUrl;

    @Value("${bonecp.username}")
    public String jdbcUsername;

    @Value("${bonecp.password}")
    public String jdbcPassword;

    @Value("${bonecp.driverClass}")
    public String driverClass;

    @Value("${bonecp.idleMaxAgeInMinutes}")
    public Integer idleMaxAgeInMinutes;

    @Value("${bonecp.idleConnectionTestPeriodInMinutes}")
    public Integer idleConnectionTestPeriodInMinutes;

    @Value("${bonecp.maxConnectionsPerPartition}")
    public Integer maxConnectionsPerPartition;

    @Value("${bonecp.minConnectionsPerPartition}")
    public Integer minConnectionsPerPartition;

    @Value("${bonecp.partitionCount}")
    public Integer partitionCount;

    @Value("${bonecp.acquireIncrement}")
    public Integer acquireIncrement;

    @Value("${bonecp.statementsCacheSize}")
    public Integer statementsCacheSize;
    /*bonecp 的数据源 end*/
}
