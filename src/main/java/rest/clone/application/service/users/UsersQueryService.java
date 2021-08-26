package rest.clone.application.service.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.clone.domain.model.user.UserIds;
import rest.clone.domain.model.user.Users;

@Service
public class UsersQueryService {
    @Autowired
    UsersRepository usersRepository;

    public Users findUsers(UserIds userIds){
        return usersRepository.findUsers(userIds);
    }

}
