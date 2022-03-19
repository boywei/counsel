package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.RecordMapper;
import top.boywei.counsel.service.RecordService;
import top.boywei.counsel.bean.Record;

@Slf4j
@Service
public class RecordServiceImpl implements RecordService {

    @Autowired
    RecordMapper recordMapper;


}
