package top.boywei.counsel.service;

import top.boywei.counsel.bean.OvertimeExample;

import java.util.List;

public interface OvertimeService {

    List<OvertimeExample> queryOvertimeHours(Integer id);

}
