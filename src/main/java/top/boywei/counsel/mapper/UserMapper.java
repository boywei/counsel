package top.boywei.counsel.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import top.boywei.counsel.bean.User;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {

    User getInfo(String name, String password);

//    @Results(id="userMap", value={
//        @Result(column="id", property="id", id=true),
//        @Result(column="name", property="name"),
//        @Result(column="password ", property="password")
//    })
    @ResultType(Map.class)
    @Select("SELECT * FROM user WHERE id = #{id}")
    Map<String, Object> getUserById(@Param("id") Integer id);

    List<User> getAllUsers();
}
