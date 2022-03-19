package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@Component
public class Chat {

    private int chatId;
    private int callerId;
    private int counselorId;
    private Date counselTime;
    private int duration;
    private int score;
    private String commentCaller;
    private String commentCounselor;

}
