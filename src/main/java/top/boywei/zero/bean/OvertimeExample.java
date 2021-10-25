package top.boywei.zero.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@Component
public class OvertimeExample {

    private int id;
    private Date month;
    private double overtime;

}
