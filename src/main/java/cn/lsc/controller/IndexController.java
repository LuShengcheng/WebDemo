package cn.lsc.controller;

import cn.lsc.common.Result;
import cn.lsc.entry.User;
import cn.lsc.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @ApiOperation(value = "测试")
    public String index() {
        return "index";
    }

    @GetMapping("/a")
    @ResponseBody
    public Result result() {
        return new Result();
    }

    @GetMapping("/list")
    @ApiOperation(value = "用户用户列表")
    public String getList(Model model) {

        List<User> userList = userService.getUserList();

        model.addAttribute(userList);
        return "userInfo";
    }

    @RequestMapping(value = "/login", method=RequestMethod.POST)
    @ApiOperation(value = "登录")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password, Model model) {

        //获取到的数据
        List<User> userList = userService.getUserList();

        for (User user1 : userList) {
            if (user1.getUserName().equals(username) && password.equals(user1.getPassword())) {
                user1.setPassword("密码123456！你试试.");
                model.addAttribute(user1);
                return "userInfo";
            }
        }
        return "null";
    }

}
