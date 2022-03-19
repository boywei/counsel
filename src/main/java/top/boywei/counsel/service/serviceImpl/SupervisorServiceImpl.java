package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.SupervisorMapper;
import top.boywei.counsel.service.SupervisorService;
import top.boywei.counsel.bean.Supervisor;

@Slf4j
@Service
public class SupervisorServiceImpl implements SupervisorService {

    @Autowired
    SupervisorMapper supervisorMapper;


}
