package com.h3c.nanaadmin.model;

import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table sys_user_token
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class SysUserToken {
    /**
     * 编号
     * id
     */
    private Long id;

    /**
     * user_id
     */
    private Long userId;

    /**
     * token
     * token
     */
    private String token;

    /**
     * 过期时间
     * expire_time
     */
    private Date expireTime;

    /**
     * 创建人
     * create_by
     */
    private String createBy;

    /**
     * 创建时间
     * create_time
     */
    private Date createTime;

    /**
     * 更新人
     * last_update_by
     */
    private String lastUpdateBy;

    /**
     * 更新时间
     * last_update_time
     */
    private Date lastUpdateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_token.id
     *
     * @return the value of sys_user_token.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_token.id
     *
     * @param id the value for sys_user_token.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_token.user_id
     *
     * @return the value of sys_user_token.user_id
     *
     * @mbg.generated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_token.user_id
     *
     * @param userId the value for sys_user_token.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_token.token
     *
     * @return the value of sys_user_token.token
     *
     * @mbg.generated
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_token.token
     *
     * @param token the value for sys_user_token.token
     *
     * @mbg.generated
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_token.expire_time
     *
     * @return the value of sys_user_token.expire_time
     *
     * @mbg.generated
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_token.expire_time
     *
     * @param expireTime the value for sys_user_token.expire_time
     *
     * @mbg.generated
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_token.create_by
     *
     * @return the value of sys_user_token.create_by
     *
     * @mbg.generated
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_token.create_by
     *
     * @param createBy the value for sys_user_token.create_by
     *
     * @mbg.generated
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_token.create_time
     *
     * @return the value of sys_user_token.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_token.create_time
     *
     * @param createTime the value for sys_user_token.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_token.last_update_by
     *
     * @return the value of sys_user_token.last_update_by
     *
     * @mbg.generated
     */
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_token.last_update_by
     *
     * @param lastUpdateBy the value for sys_user_token.last_update_by
     *
     * @mbg.generated
     */
    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy == null ? null : lastUpdateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_token.last_update_time
     *
     * @return the value of sys_user_token.last_update_time
     *
     * @mbg.generated
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_token.last_update_time
     *
     * @param lastUpdateTime the value for sys_user_token.last_update_time
     *
     * @mbg.generated
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}