package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Caller {

    private int id;
    private int phone;
    private String name;
    private String password;
    private String emergencyContact;
    private int emergencyNumber;
    private int mark;

}
