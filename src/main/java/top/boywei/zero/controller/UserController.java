package top.boywei.zero.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import top.boywei.zero.bean.User;
import top.boywei.zero.service.UserService;

import java.util.HashMap;
import java.util.Map;

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

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public Map<String, Object> getUser(@PathVariable("id") Integer id) {
        Map<String, Object> map = userService.getUser(id);
        if(map != null && !map.isEmpty()) {
            log.info("User id: {}, {}", id, map);
            return map;
        } else {
            log.info("Error: no result!");
            map = new HashMap<>(); //不然可能引用了空指针
            map.put("message", "No result!");
            map.put("errorCode", 204);
            return map;
        }
    }
}
