package com.hedian.shirodemo01.service.impl;

import com.hedian.shirodemo01.entity.RoleMenu;
import com.hedian.shirodemo01.mapper.RoleMenuMapper;
import com.hedian.shirodemo01.service.IRoleMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与菜单对应关系 服务实现类
 * </p>
 *
 * @author gjyang
 * @since 2018-12-01
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {
	
}
