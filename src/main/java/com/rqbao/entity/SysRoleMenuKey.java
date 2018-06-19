package com.rqbao.entity;

import java.io.Serializable;

public class SysRoleMenuKey implements Serializable {
    private String roleId;

    private String menuId;

    private static final long serialVersionUID = 1L;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

	@Override
	public String toString() {
		return "SysRoleMenuKey [roleId=" + roleId + ", menuId=" + menuId + "]";
	}
    
}