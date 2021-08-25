package rest.clone.application.service.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersQueryService {
    @Autowired
    UsersRepository usersRepository;

    public Users findUsers(String id){
        UserId userId = new UserId(id);
        return usersRepository.findUsers(String)
    }

}
