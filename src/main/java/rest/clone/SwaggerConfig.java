package rest.clone;

import com.google.common.base.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.*;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerSpringPlugin() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.groupName("greetingAPI")
              .apiInfo(apiInfo())
              .useDefaultResponseMessages(false)
              .select()
              .paths(patterns())
              .build();
        return docket;
    }

    private Predicate<String> patterns() {
        return or(regex("/api/.*"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("greetingAPI Documents by Swagger2")
                                   .description("This Sample Application powered by SpringBoot.")
                                   .build();
    }
}
