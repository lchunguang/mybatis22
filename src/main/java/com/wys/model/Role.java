package com.wys.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

@TableName(value = "role")
public class Role extends Model<Role> {
    @TableId(value = "role_id", type = IdType.AUTO)
    private Integer roleId;

    @TableField(value = "role_name")
    private String roleName;

    @TableField(value = "user_id")
    private Integer userId;

    @TableField(value = "role_flag")
    private String roleFlag;

    @TableField(value = "role_status")
    private Integer roleStatus;

    public static final String COL_ROLE_ID = "role_id";

    public static final String COL_ROLE_NAME = "role_name";

    public static final String COL_USER_ID = "user_id";

    public static final String COL_ROLE_FLAG = "role_flag";

    public static final String COL_ROLE_STATUS = "role_status";

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
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return role_flag
     */
    public String getRoleFlag() {
        return roleFlag;
    }

    /**
     * @param roleFlag
     */
    public void setRoleFlag(String roleFlag) {
        this.roleFlag = roleFlag;
    }

    /**
     * @return role_status
     */
    public Integer getRoleStatus() {
        return roleStatus;
    }

    /**
     * @param roleStatus
     */
    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", roleName=").append(roleName);
        sb.append(", userId=").append(userId);
        sb.append(", roleFlag=").append(roleFlag);
        sb.append(", roleStatus=").append(roleStatus);
        sb.append("]");
        return sb.toString();
    }
}