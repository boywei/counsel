package top.boywei.counsel.bean;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Binding {

    private int counselorId;
    private int supervisorId;

}
