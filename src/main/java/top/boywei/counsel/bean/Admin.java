package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Admin {

    private String name;
    private String password;

}
