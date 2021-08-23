package rest.clone.infrastructure.datasource.greeting;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import rest.clone.domain.model.greeting.GreetId;
import rest.clone.domain.model.greeting.Greeting;
import rest.clone.domain.model.greeting.Name;

import java.util.List;

@Mapper
public interface GreetingMapper {

    GreetId nextId();

    void register(@Param("greetId") GreetId greetId, @Param("name") Name name);

    List<Greeting> history();
}

