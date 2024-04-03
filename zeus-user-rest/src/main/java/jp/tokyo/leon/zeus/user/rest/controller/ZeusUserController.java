package jp.tokyo.leon.zeus.user.rest.controller;

import jp.tokyo.leon.zeus.common.api.ResponseResult;
import jp.tokyo.leon.zeus.user.api.dto.ZeusUserDTO;
import jp.tokyo.leon.zeus.user.service.ZeusUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leon
 * @date 2024/4/3 23:28
 */
@RestController
@RequestMapping("/v1/api/user")
public class ZeusUserController {

    private final ZeusUserService zeusUserService;

    public ZeusUserController(ZeusUserService zeusUserService) {
        this.zeusUserService = zeusUserService;
    }

    @GetMapping("/get-by-username")
    public ResponseResult<ZeusUserDTO> getUserByUsername(@RequestParam(name = "username")String username) {
        ZeusUserDTO dto = zeusUserService.findByUsername(username);
        return ResponseResult.ok(dto);
    }
}
