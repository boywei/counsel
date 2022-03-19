package top.boywei.counsel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//用下面这个会出错，扫描的包不完整
//@ComponentScan("top.boywei.counsel.mapper")
//应该用这个
@MapperScan("top.boywei.counsel.mapper")
public class CounselApplication {

    public static void main(String[] args) {
        SpringApplication.run(CounselApplication.class, args);
    }

}
