package jp.tokyo.leon.zeus.user.feign.client;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author leon
 * @date 2024/4/4 01:07
 */
@FeignClient(name = "zeus-user")
public interface ZeusUserFeignClient {
}
