package top.boywei.zero;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.boywei.zero.bean.User;
import top.boywei.zero.service.UserService;

@SpringBootTest
class ZeroApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User user = userService.login("rjw", "rjw1227");
        System.out.println("id: " + user.getId() +
                "\nname: " + user.getName() +
                "\npassword: " + user.getPassword());
    }

}
