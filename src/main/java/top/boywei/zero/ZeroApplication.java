package top.boywei.zero;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//用下面这个会出错，扫描的包不完整
//@ComponentScan("top.boywei.zero.mapper")
//应该用这个
@MapperScan("top.boywei.zero.mapper")
public class ZeroApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZeroApplication.class, args);
    }

}
