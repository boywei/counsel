package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@Component
public class Help {

    private int helpId;
    private int counselorId;
    private int supervisorId;
    private Date helpTime;
    private int duration;
    
}
