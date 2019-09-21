package com.wys.model;

import java.io.Serializable;

public class Role implements Serializable {
    private Integer roleId;

    private String roleName;

    private Integer userId;

    private String roleFlag;

    private Integer roleStatus;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRoleFlag() {
        return roleFlag;
    }

    public void setRoleFlag(String roleFlag) {
        this.roleFlag = roleFlag;
    }

    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        //sb.append("Hash = ").append(hashCode());
        //sb.append(", roleId=").append(roleId);
        sb.append("roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", userId=").append(userId);
        sb.append(", roleFlag=").append(roleFlag);
        sb.append(", roleStatus=").append(roleStatus);
        sb.append("]");
        return sb.toString();
    }
}