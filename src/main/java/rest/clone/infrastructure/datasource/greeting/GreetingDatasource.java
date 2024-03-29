package rest.clone.infrastructure.datasource.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rest.clone.application.service.greeting.GreetingRepository;
import rest.clone.domain.model.greeting.GreetId;
import rest.clone.domain.model.greeting.Greeting;
import rest.clone.domain.model.greeting.GreetingHistory;
import rest.clone.domain.model.greeting.Name;

import java.util.List;

@Repository
public class GreetingDatasource implements GreetingRepository {
    @Autowired
    GreetingMapper greetingMapper;

    @Override
    @Transactional
    public Greeting generate(String name) {
        GreetId greetId = greetingMapper.nextId();
        return new Greeting(greetId, new Name(name));
    }

    @Override
    @Transactional
    public void save(Greeting greeting) {
        greetingMapper.register(greeting.id(), greeting.name());
    }

    @Override
    public GreetingHistory history() {
        List<Greeting> list = greetingMapper.history();
        return new GreetingHistory(list);
    }
}
