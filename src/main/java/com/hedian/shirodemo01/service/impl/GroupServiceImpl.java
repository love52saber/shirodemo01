package com.hedian.shirodemo01.service.impl;

import com.hedian.shirodemo01.entity.Group;
import com.hedian.shirodemo01.mapper.GroupMapper;
import com.hedian.shirodemo01.service.IGroupService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户组 服务实现类
 * </p>
 *
 * @author gjyang
 * @since 2018-12-01
 */
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group> implements IGroupService {
	
}
