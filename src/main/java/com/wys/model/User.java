package com.wys.model;
import java.io.Serializable;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@TableName("user")

public class User extends Model<User> implements Serializable  {
    @TableId(value = "user_id",type = IdType.AUTO)
    private Integer userId;
    @TableField("user_name")
    private String userName;
    @TableField("user_password")

    private String userPassword;
    @TableField("user_status")

    private Integer  userStatus;
    @TableField("user_logicflag")

    private Integer userLogicflag;

    private static final long serialVersionUID = 1L;


}