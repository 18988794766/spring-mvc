package xy.standard.dao.entity;

import java.util.Date;
import lombok.Data;

@Data
public class AdminUser {
    private Integer id;

    /**
    * 登录账号
    */
    private String username;

    /**
    * 密码（加密后）
    */
    private String password;

    /**
    * md5密码盐
    */
    private String salt;

    /**
    * 头像
    */
    private String avatar;

    /**
    * 电子邮件
    */
    private String email;

    /**
    * 电话
    */
    private String phone;

    /**
    * 状态(valid：正常  invalid：无效）
    */
    private String status;

    /**
    * 创建人
    */
    private String createBy;

    /**
    * 更新人
    */
    private String updateBy;

    /**
    * 创建时间
    */
    private Date createTime;

    /**
    * 更新时间
    */
    private Date updateTime;
}