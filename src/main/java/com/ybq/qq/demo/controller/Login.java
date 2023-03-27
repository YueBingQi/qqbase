package com.ybq.qq.demo.controller;

import com.ybq.qq.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static com.ybq.qq.demo.pojo.ResultNum.*;

@RestController
@RequestMapping("/login")
public class Login {
    @Autowired
    UserService userService;
    @ResponseBody
    @GetMapping()
    public String Login(@RequestParam String account,@RequestParam String password){
        try {
//            int s = 2/0;测试错误代码
            boolean login = userService.login(account, password);
            if (login)
                return String.valueOf(SUCCESS_NUM);
            else
                return String.valueOf(DEFEATED_NUM);
        }catch (Exception e){
            return String.valueOf(ERROR_NUM);
        }

    }
}
