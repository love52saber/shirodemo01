package com.hedian.shirodemo01.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户组
 * </p>
 *
 * @author gjyang
 * @since 2018-12-01
 */
@TableName("sys_group")
public class Group extends Model<Group> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户在ID
     */
	@TableId(value="grp_id", type= IdType.AUTO)
	private Integer grpId;
    /**
     * 用户组类型：1 普通用户组 2 工单处理组
     */
	@TableField("grp_type")
	private Integer grpType;
    /**
     * 用户组名称
     */
	@TableField("grp_name")
	private String grpName;
    /**
     * 用户组描述
     */
	@TableField("grp_desc")
	private String grpDesc;
	@TableField("dept_id")
	private Long deptId;
	@TableField("user_id_create")
	private Long userIdCreate;
	@TableField("gmt_create")
	private Date gmtCreate;
	@TableField("gmt_modified")
	private Date gmtModified;
    /**
     * 使用标记： 1 使用， 0 不使用
     */
	private Integer useflag;
	@TableField("user_id_mod")
	private Long userIdMod;
    /**
     * 删除标记：0 不能删除， 1可以删除， 默认 1
     */
	private Integer delflag;


	public Integer getGrpId() {
		return grpId;
	}

	public void setGrpId(Integer grpId) {
		this.grpId = grpId;
	}

	public Integer getGrpType() {
		return grpType;
	}

	public void setGrpType(Integer grpType) {
		this.grpType = grpType;
	}

	public String getGrpName() {
		return grpName;
	}

	public void setGrpName(String grpName) {
		this.grpName = grpName;
	}

	public String getGrpDesc() {
		return grpDesc;
	}

	public void setGrpDesc(String grpDesc) {
		this.grpDesc = grpDesc;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getUserIdCreate() {
		return userIdCreate;
	}

	public void setUserIdCreate(Long userIdCreate) {
		this.userIdCreate = userIdCreate;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Integer getUseflag() {
		return useflag;
	}

	public void setUseflag(Integer useflag) {
		this.useflag = useflag;
	}

	public Long getUserIdMod() {
		return userIdMod;
	}

	public void setUserIdMod(Long userIdMod) {
		this.userIdMod = userIdMod;
	}

	public Integer getDelflag() {
		return delflag;
	}

	public void setDelflag(Integer delflag) {
		this.delflag = delflag;
	}

	@Override
	protected Serializable pkVal() {
		return this.grpId;
	}

	@Override
	public String toString() {
		return "Group{" +
			", grpId=" + grpId +
			", grpType=" + grpType +
			", grpName=" + grpName +
			", grpDesc=" + grpDesc +
			", deptId=" + deptId +
			", userIdCreate=" + userIdCreate +
			", gmtCreate=" + gmtCreate +
			", gmtModified=" + gmtModified +
			", useflag=" + useflag +
			", userIdMod=" + userIdMod +
			", delflag=" + delflag +
			"}";
	}
}
