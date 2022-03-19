package top.boywei.counsel.bean;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;

@EqualsAndHashCode(callSuper = true)
@Data
@Component
public class Supervisor extends Counselor {

    private String qualification;
    private String qualification_id;

}
