package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.CallerMapper;
import top.boywei.counsel.service.CallerService;
import top.boywei.counsel.bean.Caller;

@Slf4j
@Service
public class CallerServiceImpl implements CallerService {

    @Autowired
    CallerMapper callerMapper;


}
