package top.boywei.counsel.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.BindingMapper;
import top.boywei.counsel.service.BindingService;
import top.boywei.counsel.bean.Binding;

@Slf4j
@Service
public class BindingServiceImpl implements BindingService {

    @Autowired
    BindingMapper bindingMapper;


}
