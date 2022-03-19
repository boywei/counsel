package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
@Component
public class Record {

    private int recordId;
    private int helpId;
    private int senderId;
    private int receiverId;
    private int type;
    private Date sendTime;
    private String content;
    private int mark;
    
}
