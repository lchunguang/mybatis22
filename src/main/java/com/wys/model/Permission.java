package com.wys.model;

import java.io.Serializable;

public class Permission implements Serializable {
    private Integer permissionId;

    private Integer permissionFlag;

    private Integer roleId;

    private Integer permissionStatus;

    private static final long serialVersionUID = 1L;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public Integer getPermissionFlag() {
        return permissionFlag;
    }

    public void setPermissionFlag(Integer permissionFlag) {
        this.permissionFlag = permissionFlag;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionStatus() {
        return permissionStatus;
    }

    public void setPermissionStatus(Integer permissionStatus) {
        this.permissionStatus = permissionStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
       // sb.append("Hash = ").append(hashCode());
        //sb.append(", permissionId=").append(permissionId);
        sb.append("permissionId=").append(permissionId);
        sb.append(", permissionFlag=").append(permissionFlag);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionStatus=").append(permissionStatus);
        sb.append("]");
        return sb.toString();
    }
}