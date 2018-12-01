package com.hedian.shirodemo01.service.impl;

import com.hedian.shirodemo01.entity.Menu;
import com.hedian.shirodemo01.mapper.MenuMapper;
import com.hedian.shirodemo01.service.IMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 菜单管理 服务实现类
 * </p>
 *
 * @author gjyang
 * @since 2018-12-01
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {
	
}
