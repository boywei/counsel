package top.boywei.zero.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.zero.bean.OvertimeExample;
import top.boywei.zero.mapper.OvertimeExampleMapper;
import top.boywei.zero.service.OvertimeService;

import java.util.List;

@Service
public class OvertimeServiceImpl implements OvertimeService {

    @Autowired
    OvertimeExampleMapper overtimeExampleMapper;

    @Override
    public List<OvertimeExample> queryOvertimeHours(Integer id) {
        return overtimeExampleMapper.queryOvertime(id);
    }

}
