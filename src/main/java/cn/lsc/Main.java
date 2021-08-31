package cn.lsc;

import io.swagger.annotations.SwaggerDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;

/**
 * <p>
 * 启动类
 * </p>
 *
 * @author lushengcheng
 * @since 2021/8/31 19:27
 */
@SpringBootApplication
@SwaggerDefinition
@Async
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
