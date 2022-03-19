package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Date;

@Data
@Component
public class Message {

    private int messageId;
    private int chatId;
    private int senderId;
    private int receiverId;
    private Date sendTime;
    private int type;
    private String content;
    private int mark;

}
