package jp.tokyo.leon.zeus.user.rest.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author leon
 * @date 2024/4/3 23:39
 */
@Configuration
@EnableJpaRepositories(basePackages = {"jp.tokyo.leon.zeus.user.db.repository"})
@EntityScan(basePackages = "jp.tokyo.leon.zeus.user.db.entity")
public class JpaConfig {
}
