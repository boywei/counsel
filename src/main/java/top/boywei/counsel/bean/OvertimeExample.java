package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@Component
public class OvertimeExample {

    private int id;
    private String month;
    private double overtime;

}
