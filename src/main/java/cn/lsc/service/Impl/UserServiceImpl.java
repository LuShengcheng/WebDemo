package cn.lsc.service.Impl;

import cn.lsc.entry.User;
import cn.lsc.mapper.UserMapper;
import cn.lsc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户service
 * </p>
 *
 * @author lushengcheng
 * @since 2021/8/31 20:12
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;

    /**
     * description 获取用户列表
     *
     * @return java.util.List<cn.lsc.entry.User>
     * @author lushengcheng
     * @since 2021/8/31 20:11
     */
    @Override
    public List<User> getUserList() {
        return userMapper.selectList(null);
    }

}
