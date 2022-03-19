package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.AdminMapper;
import top.boywei.counsel.service.AdminService;
import top.boywei.counsel.bean.Admin;

@Slf4j
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminMapper adminMapper;


}
