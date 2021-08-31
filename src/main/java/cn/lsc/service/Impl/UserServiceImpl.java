package cn.lsc.service.Impl;

import cn.lsc.entry.User;
import cn.lsc.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    /**
     * description 获取用户列表
     *
     * @return java.util.List<cn.lsc.entry.User>
     * @author lushengcheng
     * @since 2021/8/31 20:11
     */
    @Override
    public List<User> getUserList() {

        List<User>  userList = new ArrayList<>();

        for (int i = 1; i < 7; i++) {

            User user = new User();

            user.setId(String.valueOf(i));
            user.setName("user"+i);
            user.setPassword("123456");
            user.setPhone("100000"+i);

            userList.add(user);
        }


        return userList;
    }
}
