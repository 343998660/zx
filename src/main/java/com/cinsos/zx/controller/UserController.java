package com.cinsos.zx.controller;

import com.cinsos.zx.entity.User;
import com.cinsos.zx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/")
public class UserController {
    @Autowired
    UserService userService;
   @GetMapping
    public String login(){
        return "login";
    }
    @PostMapping("/login")
    public String  login(@RequestParam Map<String,String> map , HttpSession session){
        String username=map.get("username");
        String password=map.get("password");
        String em = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        String ph = "^[1][3578]\\d{9}$";
        User user=new User();
        if(username.matches(em)){//邮箱登录
            user=userService.findUserEmail(username);
        }else if(username.matches(ph)){
            user=userService.findUserPhone(Float.parseFloat(username));
        }
        if(user==null){
            return "用户名错误";
        }else if(user.getUser_passWord().equals(password)){
            return "登录成功";
        }else {
            return "密码错误";
        }
    }
}
