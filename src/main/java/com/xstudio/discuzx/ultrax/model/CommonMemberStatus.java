package com.xstudio.discuzx.ultrax.model;

import com.xstudio.tool.utils.BaseModelObject;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Database Table Remarks:
 *   用户状态表
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table pre_common_member_status
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CommonMemberStatus extends BaseModelObject<Integer> implements Serializable {
    /**
     * Database Column Remarks:
     *   会员id
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.uid
     *
     * @mbg.generated
     */
    private Integer uid;

    /**
     * Database Column Remarks:
     *   注册IP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.regip
     *
     * @mbg.generated
     */
    private String regip;

    /**
     * Database Column Remarks:
     *   最后登录IP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.lastip
     *
     * @mbg.generated
     */
    private String lastip;

    /**
     * Database Column Remarks:
     *   最后登录端口号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.port
     *
     * @mbg.generated
     */
    private Short port;

    /**
     * Database Column Remarks:
     *   最后访问
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.lastvisit
     *
     * @mbg.generated
     */
    private Integer lastvisit;

    /**
     * Database Column Remarks:
     *   最后活动
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.lastactivity
     *
     * @mbg.generated
     */
    private Integer lastactivity;

    /**
     * Database Column Remarks:
     *   最后发表
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.lastpost
     *
     * @mbg.generated
     */
    private Integer lastpost;

    /**
     * Database Column Remarks:
     *   上次发送email时间 home原字段为lastsend
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.lastsendmail
     *
     * @mbg.generated
     */
    private Integer lastsendmail;

    /**
     * Database Column Remarks:
     *   是否隐身登录
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.invisible
     *
     * @mbg.generated
     */
    private Boolean invisible;

    /**
     * Database Column Remarks:
     *   买家信用等级及积分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.buyercredit
     *
     * @mbg.generated
     */
    private Short buyercredit;

    /**
     * Database Column Remarks:
     *   卖家信用等级及积分
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.sellercredit
     *
     * @mbg.generated
     */
    private Short sellercredit;

    /**
     * Database Column Remarks:
     *   个人空间收藏次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.favtimes
     *
     * @mbg.generated
     */
    private Integer favtimes;

    /**
     * Database Column Remarks:
     *   个人空间分享次数
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.sharetimes
     *
     * @mbg.generated
     */
    private Integer sharetimes;

    /**
     * Database Column Remarks:
     *   个人资料完成度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pre_common_member_status.profileprogress
     *
     * @mbg.generated
     */
    private Byte profileprogress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table pre_common_member_status
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void assignKeyValue(Integer key) {
        this.uid = key;
    }

    @Override
    public Integer valueOfKey() {
        return uid;
    }
}