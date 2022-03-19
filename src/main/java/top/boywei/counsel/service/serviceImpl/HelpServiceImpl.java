package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.HelpMapper;
import top.boywei.counsel.service.HelpService;
import top.boywei.counsel.bean.Help;

@Slf4j
@Service
public class HelpServiceImpl implements HelpService {

    @Autowired
    HelpMapper helpMapper;


}
