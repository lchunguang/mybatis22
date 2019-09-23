package com.wys.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

@TableName(value = "permission")
public class Permission  extends Model<Permission> implements Serializable {
    @TableId(value = "permission_id", type = IdType.AUTO)
    private Integer permissionId;

    @TableField(value = "permission_flag")
    private Integer permissionFlag;

    @TableField(value = "role_id")
    private Integer roleId;

    @TableField(value = "permission_status")
    private Integer permissionStatus;

    private static final long serialVersionUID = 1L;

    public static final String COL_PERMISSION_ID = "permission_id";

    public static final String COL_PERMISSION_FLAG = "permission_flag";

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_PERMISSION_STATUS = "permission_status";

    /**
     * @return permission_id
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * @param permissionId
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * @return permission_flag
     */
    public Integer getPermissionFlag() {
        return permissionFlag;
    }

    /**
     * @param permissionFlag
     */
    public void setPermissionFlag(Integer permissionFlag) {
        this.permissionFlag = permissionFlag;
    }

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return permission_status
     */
    public Integer getPermissionStatus() {
        return permissionStatus;
    }

    /**
     * @param permissionStatus
     */
    public void setPermissionStatus(Integer permissionStatus) {
        this.permissionStatus = permissionStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", permissionId=").append(permissionId);
        sb.append(", permissionFlag=").append(permissionFlag);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionStatus=").append(permissionStatus);
        sb.append("]");
        return sb.toString();
    }
}