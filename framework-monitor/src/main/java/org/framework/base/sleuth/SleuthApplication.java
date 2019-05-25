package org.framework.base.sleuth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * SpringBoot链路追踪中心启动器
 *
 * @author Flyglede
 * @date 2019-02-28
 * @see SpringBootApplication
 * @see EnableZipkinServer
 * @see EnableDiscoveryClient
 * @see EnableAutoConfiguration
 * @see DataSourceAutoConfiguration
 * @see DataSourceTransactionManagerAutoConfiguration
 * @see SpringApplication
 * @since 1.0.0
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class})
@EnableZipkinServer
@EnableDiscoveryClient
public class SleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(SleuthApplication.class, args);
    }
}