package top.boywei.zero.service;

import top.boywei.zero.bean.OvertimeExample;

import java.util.List;

public interface OvertimeService {

    List<OvertimeExample> queryOvertimeHours(Integer id);

}
