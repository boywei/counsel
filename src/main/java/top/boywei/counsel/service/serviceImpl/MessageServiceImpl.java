package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.MessageMapper;
import top.boywei.counsel.service.MessageService;
import top.boywei.counsel.bean.Message;

@Slf4j
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageMapper messageMapper;


}
