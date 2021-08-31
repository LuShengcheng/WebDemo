package cn.lsc.service;

import cn.lsc.entry.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户服务接口
 * </p>
 *
 * @author lushengcheng
 * @since 2021/8/31 20:09
 */

// 注解 将 userservice注入到spring容器工厂
@Service
public interface UserService {

   /**
    * description 获取用户列表
    * @return java.util.List<cn.lsc.entry.User>
    * @author lushengcheng
    * @since 2021/8/31 20:11
   */
    public List<User> getUserList();

}
