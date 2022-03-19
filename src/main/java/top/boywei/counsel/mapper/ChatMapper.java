package top.boywei.counsel.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import top.boywei.counsel.bean.Chat;

import java.util.List;
import java.util.Map;

@Repository
public interface ChatMapper {

    List<Chat> getAllChats();

}
