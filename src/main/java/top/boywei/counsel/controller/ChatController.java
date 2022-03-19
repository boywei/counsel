package top.boywei.counsel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.boywei.counsel.service.ChatService;
import top.boywei.counsel.bean.Chat;

@RestController
@Slf4j
public class ChatController {

    @Autowired
    ChatService chatService;

}
