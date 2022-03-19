package top.boywei.counsel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.boywei.counsel.service.HelpService;
import top.boywei.counsel.bean.Help;

@RestController
@Slf4j
public class HelpController {

    @Autowired
    HelpService helpService;

}
