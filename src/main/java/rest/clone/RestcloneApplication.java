package rest.clone;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import rest.clone.infrastructure.configuration.objectMapper.CustomObjectMapper;

@SpringBootApplication
public class RestcloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestcloneApplication.class, args);
    }

    @Bean
    public ObjectMapper directFieldAccess() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(objectMapper.getSerializationConfig()
                                               .getDefaultVisibilityChecker()
                                               .withFieldVisibility(JsonAutoDetect.Visibility.ANY)
                                               .withGetterVisibility(JsonAutoDetect.Visibility.NONE)
                                               .withSetterVisibility(JsonAutoDetect.Visibility.NONE)
                                               .withCreatorVisibility(JsonAutoDetect.Visibility.NONE));
        return objectMapper;
    }

}
