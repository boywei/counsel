package top.boywei.counsel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.boywei.counsel.service.BindingService;
import top.boywei.counsel.bean.Binding;

@RestController
@Slf4j
public class BindingController {

    @Autowired
    BindingService bindingService;

}
