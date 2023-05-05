package cn.corpus.student.vo;

import lombok.Data;

/**
 * @version:1.0
 */
@Data
public class ModifyPwdModel {

    /**
     * 旧密码
     */
    private String usedPass;

    /**
     * 新密码
     */
    private String newPass;

    /**
     * 登录用户ID
     */
    private Long userId;
}
