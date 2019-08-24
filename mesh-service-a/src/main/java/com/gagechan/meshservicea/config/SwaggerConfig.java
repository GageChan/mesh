package com.gagechan.meshservicea.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description swagger 配置
 * @Date 2019-08-06 14:37
 * @Created by GageChan
 */

@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerConfig {

    @Bean
    public Docket defaultApi() {
//        ParameterBuilder tokenPar = new ParameterBuilder();
//        List<Parameter> pars = new ArrayList<>();
//        tokenPar.name("token").description("token").modelRef(new ModelRef("string")).parameterType("header").required(false).hidden(false).build();
//        pars.add(tokenPar.build());
//        List<ApiKey> apiKeyList = new ArrayList();
//        apiKeyList.add(new ApiKey("token", "token", "header"));

        List<Parameter> parameterList = new ArrayList<>();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(parameterList);
//                .globalOperationParameters(parameterList).securitySchemes(apiKeyList);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("服务a")
                .description("apis of member")
                .termsOfServiceUrl("https://www.superzoo.com.cn/")
                .version("1.0")
                .build();
    }

}
