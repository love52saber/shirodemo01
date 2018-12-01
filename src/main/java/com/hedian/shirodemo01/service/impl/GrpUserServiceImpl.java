package com.hedian.shirodemo01.service.impl;

import com.hedian.shirodemo01.entity.GrpUser;
import com.hedian.shirodemo01.mapper.GrpUserMapper;
import com.hedian.shirodemo01.service.IGrpUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户组包含用户表 服务实现类
 * </p>
 *
 * @author gjyang
 * @since 2018-12-01
 */
@Service
public class GrpUserServiceImpl extends ServiceImpl<GrpUserMapper, GrpUser> implements IGrpUserService {
	
}
