package com.hedian.shirodemo01.service.impl;

import com.hedian.shirodemo01.entity.User;
import com.hedian.shirodemo01.mapper.UserMapper;
import com.hedian.shirodemo01.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Yanghu
 * @since 2018-11-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
	
}
