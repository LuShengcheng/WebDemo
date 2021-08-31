package cn.lsc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * <p>
 * 配置类
 * </p>
 *
 * @author lushengcheng
 * @since 2021/8/31 20:25
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private final String split=";";
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.lsc"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("blog接口文档")
                .description("blog接口文档")
                .contact(new Contact("cn.lsc", "http:localhost:8080/doc.html", "lushengcheng@hotmail.com"))
                .version("1.0")
                .build();
    }

}
