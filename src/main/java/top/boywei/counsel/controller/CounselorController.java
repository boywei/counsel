package top.boywei.counsel.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.boywei.counsel.service.CounselorService;
import top.boywei.counsel.bean.Counselor;

@RestController
@Slf4j
public class CounselorController {

    @Autowired
    CounselorService counselorService;

}
