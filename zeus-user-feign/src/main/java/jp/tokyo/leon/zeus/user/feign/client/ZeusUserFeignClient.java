package jp.tokyo.leon.zeus.user.feign.client;

import jp.tokyo.leon.zeus.common.api.ResponseResult;
import jp.tokyo.leon.zeus.user.api.dto.ZeusUserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author leon
 * @date 2024/4/4 01:07
 */
@FeignClient(name = "zeus-user", path = "/v1/api/user")
public interface ZeusUserFeignClient {

    @GetMapping("/get-by-username")
    ResponseResult<ZeusUserDTO> getUserByUsername(@RequestParam(name = "username")String username);
}
