package org.framework.base.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * SpringBoot熔断中心启动器
 *
 * @author Flyglede
 * @date 2019-03-13
 * @see SpringBootApplication
 * @see EnableHystrixDashboard
 * @see EnableTurbine
 * @see EnableDiscoveryClient
 * @see EnableAutoConfiguration
 * @see DataSourceAutoConfiguration
 * @see DataSourceTransactionManagerAutoConfiguration
 * @see MybatisAutoConfiguration
 * @see SpringApplication
 * @since 1.0.0
 */

@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
@EnableDiscoveryClient
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
public class HystrixApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixApplication.class, args);
    }
}