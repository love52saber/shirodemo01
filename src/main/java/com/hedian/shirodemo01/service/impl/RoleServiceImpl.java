package com.hedian.shirodemo01.service.impl;

import com.hedian.shirodemo01.entity.Role;
import com.hedian.shirodemo01.mapper.RoleMapper;
import com.hedian.shirodemo01.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author gjyang
 * @since 2018-12-01
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {
	
}
