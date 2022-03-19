package top.boywei.counsel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.boywei.counsel.service.RecordService;
import top.boywei.counsel.bean.Record;

@RestController
@Slf4j
public class RecordController {

    @Autowired
    RecordService recordService;

}
