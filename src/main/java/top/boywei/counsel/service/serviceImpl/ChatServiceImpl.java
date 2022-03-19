package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.ChatMapper;
import top.boywei.counsel.service.ChatService;
import top.boywei.counsel.bean.Chat;

@Slf4j
@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    ChatMapper chatMapper;


}
