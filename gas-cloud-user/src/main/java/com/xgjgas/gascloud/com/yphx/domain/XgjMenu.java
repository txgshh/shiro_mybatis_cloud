package com.xgjgas.gascloud.com.yphx.domain;

import java.io.Serializable;
import java.util.Date;

public class XgjMenu implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.ID
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.PARENT_ID
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.PARENT_IDS
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String parentIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.NAME
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.SORT
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private Long sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.HREF
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String href;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.TARGET
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String target;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.ICON
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.IS_SHOW
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String isShow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.PERMISSION
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.CREATE_BY
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String createBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.CREATE_DATE
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.UPDATE_BY
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String updateBy;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.UPDATE_DATE
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.REMARKS
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String remarks;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xgj_base_menu.DEL_FLAG
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private String delFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xgj_base_menu
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.ID
     *
     * @return the value of xgj_base_menu.ID
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.ID
     *
     * @param id the value for xgj_base_menu.ID
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.PARENT_ID
     *
     * @return the value of xgj_base_menu.PARENT_ID
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.PARENT_ID
     *
     * @param parentId the value for xgj_base_menu.PARENT_ID
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.PARENT_IDS
     *
     * @return the value of xgj_base_menu.PARENT_IDS
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getParentIds() {
        return parentIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.PARENT_IDS
     *
     * @param parentIds the value for xgj_base_menu.PARENT_IDS
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.NAME
     *
     * @return the value of xgj_base_menu.NAME
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.NAME
     *
     * @param name the value for xgj_base_menu.NAME
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.SORT
     *
     * @return the value of xgj_base_menu.SORT
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public Long getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.SORT
     *
     * @param sort the value for xgj_base_menu.SORT
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.HREF
     *
     * @return the value of xgj_base_menu.HREF
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getHref() {
        return href;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.HREF
     *
     * @param href the value for xgj_base_menu.HREF
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.TARGET
     *
     * @return the value of xgj_base_menu.TARGET
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getTarget() {
        return target;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.TARGET
     *
     * @param target the value for xgj_base_menu.TARGET
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setTarget(String target) {
        this.target = target == null ? null : target.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.ICON
     *
     * @return the value of xgj_base_menu.ICON
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.ICON
     *
     * @param icon the value for xgj_base_menu.ICON
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.IS_SHOW
     *
     * @return the value of xgj_base_menu.IS_SHOW
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.IS_SHOW
     *
     * @param isShow the value for xgj_base_menu.IS_SHOW
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setIsShow(String isShow) {
        this.isShow = isShow == null ? null : isShow.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.PERMISSION
     *
     * @return the value of xgj_base_menu.PERMISSION
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.PERMISSION
     *
     * @param permission the value for xgj_base_menu.PERMISSION
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.CREATE_BY
     *
     * @return the value of xgj_base_menu.CREATE_BY
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.CREATE_BY
     *
     * @param createBy the value for xgj_base_menu.CREATE_BY
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.CREATE_DATE
     *
     * @return the value of xgj_base_menu.CREATE_DATE
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.CREATE_DATE
     *
     * @param createDate the value for xgj_base_menu.CREATE_DATE
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.UPDATE_BY
     *
     * @return the value of xgj_base_menu.UPDATE_BY
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.UPDATE_BY
     *
     * @param updateBy the value for xgj_base_menu.UPDATE_BY
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.UPDATE_DATE
     *
     * @return the value of xgj_base_menu.UPDATE_DATE
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.UPDATE_DATE
     *
     * @param updateDate the value for xgj_base_menu.UPDATE_DATE
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.REMARKS
     *
     * @return the value of xgj_base_menu.REMARKS
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.REMARKS
     *
     * @param remarks the value for xgj_base_menu.REMARKS
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xgj_base_menu.DEL_FLAG
     *
     * @return the value of xgj_base_menu.DEL_FLAG
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xgj_base_menu.DEL_FLAG
     *
     * @param delFlag the value for xgj_base_menu.DEL_FLAG
     *
     * @mbg.generated Wed Nov 21 11:30:56 CST 2018
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }
}