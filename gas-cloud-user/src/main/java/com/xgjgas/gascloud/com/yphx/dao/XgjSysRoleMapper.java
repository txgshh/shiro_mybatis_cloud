package com.xgjgas.gascloud.com.yphx.dao;

import com.xgjgas.gascloud.com.yphx.domain.XgjSysRole;
import com.xgjgas.gascloud.com.yphx.domain.XgjSysRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface XgjSysRoleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    long countByExample(XgjSysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int deleteByExample(XgjSysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int insert(XgjSysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int insertSelective(XgjSysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    List<XgjSysRole> selectByExample(XgjSysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    XgjSysRole selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int updateByExampleSelective(@Param("record") XgjSysRole record, @Param("example") XgjSysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int updateByExample(@Param("record") XgjSysRole record, @Param("example") XgjSysRoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int updateByPrimaryKeySelective(XgjSysRole record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xgj_base_sys_role
     *
     * @mbg.generated Wed Nov 21 11:24:21 CST 2018
     */
    int updateByPrimaryKey(XgjSysRole record);
}