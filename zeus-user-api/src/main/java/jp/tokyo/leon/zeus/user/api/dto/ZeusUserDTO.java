package jp.tokyo.leon.zeus.user.api.dto;

import lombok.Data;

/**
 * @author leon
 * @date 2024/4/4 00:48
 */
@Data
public class ZeusUserDTO {

    private Long id;

    private String username;

    private String password;
}
