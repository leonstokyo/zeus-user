package jp.tokyo.leon.zeus.user.service.impl;

import jp.tokyo.leon.zeus.user.api.dto.ZeusUserDTO;
import jp.tokyo.leon.zeus.user.db.entity.ZeusUser;
import jp.tokyo.leon.zeus.user.db.repository.ZeusUserRepository;
import jp.tokyo.leon.zeus.user.service.ZeusUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author leon
 * @date 2024/4/3 23:22
 */
@Service
public class ZeusUserServiceImpl implements ZeusUserService {

    private final ZeusUserRepository zeusUserRepository;

    public ZeusUserServiceImpl(ZeusUserRepository zeusUserRepository) {
        this.zeusUserRepository = zeusUserRepository;
    }

    @Override
    public ZeusUserDTO findByUsername(String username) {
        ZeusUser user = zeusUserRepository.findZeusUserByUsername(username).orElse(null);
        if (Objects.nonNull(user)) {
            ZeusUserDTO dto = new ZeusUserDTO();
            BeanUtils.copyProperties(user, dto);
            return dto;
        }
        return null;
    }
}
