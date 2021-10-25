package top.boywei.zero.mapper;

import org.springframework.stereotype.Repository;
import top.boywei.zero.bean.User;

@Repository
public interface UserMapper {

    User getInfo(String name, String password);

}
