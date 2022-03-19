package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Counselor {

    private int id;
    private String name;
    private int gender;
    private int age;
    private String idCard;
    private int phone;
    private String email;
    private String userName;
    private String password;
    private String workplace;
    private String position;
    private int status;

}
