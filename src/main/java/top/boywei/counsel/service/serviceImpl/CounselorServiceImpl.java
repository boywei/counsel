package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.CounselorMapper;
import top.boywei.counsel.service.CounselorService;
import top.boywei.counsel.bean.Counselor;

@Slf4j
@Service
public class CounselorServiceImpl implements CounselorService {

    @Autowired
    CounselorMapper counselorMapper;


}
