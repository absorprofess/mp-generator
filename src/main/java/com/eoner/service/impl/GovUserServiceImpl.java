package com.eoner.service.impl;

import com.eoner.entity.GovUser;
import com.eoner.mapper.GovUserMapper;
import com.eoner.service.IGovUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 政府用户 服务实现类
 * </p>
 *
 * @author pengzhaofeng
 * @since 2020-05-06
 */
@Service
public class GovUserServiceImpl extends ServiceImpl<GovUserMapper, GovUser> implements IGovUserService {

}
