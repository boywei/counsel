package top.boywei.counsel.mapper;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import top.boywei.counsel.bean.Message;

import java.util.List;
import java.util.Map;

@Repository
public interface MessageMapper {

    List<Message> getAllMessages();

}
