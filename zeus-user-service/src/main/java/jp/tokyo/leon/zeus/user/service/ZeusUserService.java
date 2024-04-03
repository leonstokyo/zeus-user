package jp.tokyo.leon.zeus.user.service;

import jp.tokyo.leon.zeus.user.api.dto.ZeusUserDTO;

/**
 * @author leon
 * @date 2024/4/3 23:19
 */
public interface ZeusUserService {

    ZeusUserDTO findByUsername(String username);
}
