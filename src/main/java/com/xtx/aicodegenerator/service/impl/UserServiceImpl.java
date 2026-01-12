package com.xtx.aicodegenerator.service.impl

/xtx/aicodegenerator.genresult.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
/xtx/aicodegenerator.genresult.entity.User;
/xtx/aicodegenerator.genresult.mapper.UserMapper;
import com/xtx/aicodegenerator.genresult.service.UserService;
import com.xtx.aicodegenerator.mapper.UserMapper;
import com.xtx.aicodegenerator.model.entity.User;
import com.xtx.aicodegenerator.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户 服务层实现。
 *
 * @author <a>xtx</a>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService {

}
