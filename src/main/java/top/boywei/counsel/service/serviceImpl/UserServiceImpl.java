package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.UserMapper;
import top.boywei.counsel.service.UserService;
import top.boywei.counsel.bean.User;

import java.util.List;
import java.util.Map;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String name, String password) {
        log.info("login by \"{}\" with password: {}", name, password);
        return userMapper.getInfo(name, password);
    }

    @Override
    public Map<String, Object> getUser(Integer id) {
        log.info("Query user by id: {}", id);
        return userMapper.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        log.info("Query all users ...");
        return userMapper.getAllUsers();
    }

}
