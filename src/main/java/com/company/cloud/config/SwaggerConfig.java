package com.company.cloud.config;

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

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .groupName("Swagger1")  //分组
                .select()
            /*    .paths(PathSelectors.ant("/test/**"))*/  //匹配的路径生成接口文档
                .paths(PathSelectors.ant("/swagger1/**"))  //匹配的路径生成接口文档
                .apis(RequestHandlerSelectors.basePackage("com.company.cloud")) //加载那个包下的接口
                .build();
    }



    @Bean
    public ApiInfo getApiInfo(){
        Contact contact=new Contact("联系管理员","https://mail.qq.com/","985678325@qq.com");
        return  new ApiInfoBuilder()
                .contact(contact)
                .description("接口文档的描述信息")
                .title("接口文档的大标题")
                .termsOfServiceUrl("https://mail.qq.com/") //链接
                .version("2.0.5")
                .build();
    }





    @Bean
    public Docket getDocket2(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(getApiInfo())
                .groupName("Swagger2")  //分组
                .select()
                .paths(PathSelectors.ant("/swagger2/**"))  //匹配的路径生成接口文档
                .apis(RequestHandlerSelectors.basePackage("com.company.cloud")) //加载那个包下的接口
                .build();
    }

}
