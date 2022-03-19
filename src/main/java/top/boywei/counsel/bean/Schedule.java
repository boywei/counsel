package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Schedule {

    private int scheduleId;
    private int personId;
    private int personType;
    private int weekday;
    
}
