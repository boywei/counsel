package top.boywei.counsel.service;

import top.boywei.counsel.bean.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    User login(String name, String password);

    Map<String, Object> getUser(Integer id);

    List<User> getAllUsers();
}
