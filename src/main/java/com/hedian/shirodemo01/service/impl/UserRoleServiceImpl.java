package com.hedian.shirodemo01.service.impl;

import com.hedian.shirodemo01.entity.UserRole;
import com.hedian.shirodemo01.mapper.UserRoleMapper;
import com.hedian.shirodemo01.service.IUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户与角色对应关系 服务实现类
 * </p>
 *
 * @author gjyang
 * @since 2018-12-01
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {
	
}
