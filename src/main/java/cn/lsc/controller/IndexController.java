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

import java.util.Date;
import java.util.List;

/**
 * <p>
 * 控制器
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

    @GetMapping("/add")
    @ResponseBody
    public boolean add(@RequestParam("username") String username,
                      @RequestParam("password") String password, Model model){
        User user = new User();

        user.setId(3);
        user.setUserName(username);
        user.setPassword(password);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setDel(0);

        return userService.add(user);
    }

    @RequestMapping(value = "/login", method=RequestMethod.POST)
    @ApiOperation(value = "登录")
    @ResponseBody
    public Result login(@RequestParam("username") String username,
                        @RequestParam("password") String password, Model model) {

        //获取到的数据
        List<User> userList = userService.getUserList();

        for (User user1 : userList) {
            if (user1.getUserName().equals(username) && password.equals(user1.getPassword())) {
                user1.setPassword("密码123456！你试试.");
                model.addAttribute(user1);
                return new Result(1,"登录成功！",user1);
            }
        }
        return null;
    }

}
