package jp.tokyo.leon.zeus.user.db.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author leon
 * @date 2024/4/3 22:43
 */
@Setter
@Getter
@Entity(name = "`user`")
public class ZeusUser extends BaseEntity{

    private Byte type;

    private String username;

    private String countryCode;

    private String mobile;

    private String password;

    private String payPassword;

    private Byte payPasswordSetting;

    private String email;

    private String realName;

    private Byte idCardType;

    private Byte authStatus;

    private String gaSecret;

    private Byte gaStatus;

    private String idCard;

    private Integer level;

    private LocalDateTime authTime;

    private Integer loginCount;

    private Byte status;

    private String inviteCode;

    private String inviteRelation;

    private Long directInviteId;

    private Boolean deductibleFlag;

    private Byte reviewStatus;

    private String agentNote;

    private String accessKeyId;

    private String accessKeySecret;

    private Long referAuthId;
}
