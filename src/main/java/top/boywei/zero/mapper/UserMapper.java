package top.boywei.zero.mapper;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.boywei.zero.bean.User;

import java.util.Map;

@Repository
public interface UserMapper {

    User getInfo(String name, String password);

    Map<String, Object> getUserById(@Param("id") Integer id);

}
