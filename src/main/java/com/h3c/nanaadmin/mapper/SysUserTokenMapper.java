package com.h3c.nanaadmin.mapper;

import com.h3c.nanaadmin.model.SysUserToken;
import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysUserTokenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_token
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_token
     *
     * @mbg.generated
     */
    int insert(SysUserToken record);
    
    int insertSelective(SysUserToken record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_token
     *
     * @mbg.generated
     */
    SysUserToken selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_token
     *
     * @mbg.generated
     */
    List<SysUserToken> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_token
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysUserToken record);
    
    SysUserToken findByUserId(@Param(value="userId") Long userId);

    SysUserToken findByToken(@Param(value="token") String token);

}