package top.boywei.zero.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.boywei.zero.bean.OvertimeExample;
import top.boywei.zero.service.OvertimeService;

import java.util.List;

@RestController
@Slf4j
public class OvertimeController {

    @Autowired
    OvertimeService overtimeService;

    @RequestMapping("/overtime")
    public String overtime() {
        log.info("Starting to query overtime...");
        List<OvertimeExample> list = overtimeService.queryOvertimeHours(2);
        if(list != null) {
            for(OvertimeExample temp : list) {
                log.info(temp.toString());
            }
            return "Query successfully!";
        } else {
            return "Error in query!";
        }


    }

}
