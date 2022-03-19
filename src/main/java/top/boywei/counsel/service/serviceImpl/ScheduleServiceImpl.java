package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.ScheduleMapper;
import top.boywei.counsel.service.ScheduleService;
import top.boywei.counsel.bean.Schedule;

@Slf4j
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    ScheduleMapper scheduleMapper;


}
