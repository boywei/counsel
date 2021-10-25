package top.boywei.zero.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.boywei.zero.bean.User;
import top.boywei.zero.service.UserService;

@RestController
@Slf4j
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String name, String password) {
        User user = userService.login(name, password);
        if(user != null) {
            log.info("User:\"{}\" login successfully!", user.getName());
            return "success";
        } else {
            return "error";
        }
    }
}
