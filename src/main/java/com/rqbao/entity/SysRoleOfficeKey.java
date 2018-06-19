package com.rqbao.entity;

import java.io.Serializable;

public class SysRoleOfficeKey implements Serializable {
	private String roleId;

	private String officeId;

	private static final long serialVersionUID = 1L;

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId == null ? null : roleId.trim();
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId == null ? null : officeId.trim();
	}

	@Override
	public String toString() {
		return "SysRoleOfficeKey [roleId=" + roleId + ", officeId=" + officeId + "]";
	}

}