package jp.tokyo.leon.zeus.user.rest;

import jp.tokyo.leon.zeus.common.log.EnableZeusApiLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author longtao.guan
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZeusApiLog
@ComponentScan(basePackages = {"jp.tokyo.leon.zeus.user.rest", "jp.tokyo.leon.zeus.user.service"})
public class ZeusUserRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZeusUserRestApplication.class);
    }
}
