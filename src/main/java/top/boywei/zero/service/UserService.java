package top.boywei.zero.service;

import top.boywei.zero.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    User login(String name, String password);

    Map<String, Object> getUser(Integer id);

    List<User> getAllUsers();
}
