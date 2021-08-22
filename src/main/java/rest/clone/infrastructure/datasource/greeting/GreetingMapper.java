package rest.clone.infrastructure.datasource.greeting;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import rest.clone.domain.model.material.greet.GreetId;
import rest.clone.domain.model.material.greet.Name;

@Mapper
public interface GreetingMapper {

    GreetId nextId();

    void register(@Param("greetId") GreetId greetId, @Param("name") Name name);
}

