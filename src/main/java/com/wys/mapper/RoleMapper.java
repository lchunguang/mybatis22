package com.wys.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wys.model.Role;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {
    
    
    //自定义方法
    List<Role> selectRolesBYRoleIdOrRoleName(String roleName,Integer roleId);
}