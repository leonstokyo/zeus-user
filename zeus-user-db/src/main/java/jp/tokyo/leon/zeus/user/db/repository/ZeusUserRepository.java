package jp.tokyo.leon.zeus.user.db.repository;

import jp.tokyo.leon.zeus.user.db.entity.ZeusUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

/**
 * @author leon
 * @date 2024/4/3 23:17
 */
public interface ZeusUserRepository extends JpaRepository<ZeusUser, Long>, JpaSpecificationExecutor<ZeusUser> {
    Optional<ZeusUser> findZeusUserByUsername(String username);
}
