package top.boywei.counsel.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.boywei.counsel.mapper.OvertimeExampleMapper;
import top.boywei.counsel.service.OvertimeService;
import top.boywei.counsel.bean.OvertimeExample;

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
