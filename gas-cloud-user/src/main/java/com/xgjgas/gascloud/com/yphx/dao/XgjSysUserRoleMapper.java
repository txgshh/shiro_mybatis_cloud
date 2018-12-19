package com.xgjgas.gascloud.com.yphx.dao;

import com.xgjgas.gascloud.com.yphx.domain.XgjSysUserRole;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XgjSysUserRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    long countByExample(XgjSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int deleteByExample(XgjSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int insert(XgjSysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int insertSelective(XgjSysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    List<XgjSysUserRole> selectByExample(XgjSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    XgjSysUserRole selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") XgjSysUserRole record, @Param("example") XgjSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int updateByExample(@Param("record") XgjSysUserRole record, @Param("example") XgjSysUserRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int updateByPrimaryKeySelective(XgjSysUserRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_join_sys_user_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int updateByPrimaryKey(XgjSysUserRole record);
}