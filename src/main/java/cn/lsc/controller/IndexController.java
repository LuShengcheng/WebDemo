package cn.lsc.controller;

import cn.lsc.common.Result;
import cn.lsc.entry.User;
import cn.lsc.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 * 主页启动测试
 * </p>
 *
 * @author lushengcheng
 * @since 2021/8/31 19:37
 */
@Controller
@Api("测试controller")
public class IndexController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    @ResponseBody
    @ApiOperation(value = "测试")
    public String index() {
        return "111111111111";
    }

    @GetMapping("/a")
    @ResponseBody
    public Result result() {
        return new Result();
    }

    @GetMapping("/list")
    @ResponseBody
    @ApiOperation(value = "用户用户列表")
    public Result getList() {

        List<User> userList = userService.getUserList();

        return new Result(userList);
    }

    @PostMapping("/login")
    @ResponseBody
    @ApiOperation(value = "登录")
    public Result login(String userName, String password) {

        //获取到的数据
        List<User> userList = userService.getUserList();

        for (User user : userList) {
            if (user.getName().equals(userName) && password.equals(user.getPassword())) {
                return new Result(1, "登录成功", user);
            }
        }
        return new Result("登录失败");
    }
}
