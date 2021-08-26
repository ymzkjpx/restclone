package rest.clone.infrastructure.datasource.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import rest.clone.application.service.users.UsersRepository;
import rest.clone.domain.model.user.User;
import rest.clone.presentation.view.model.users.UserId;

@Repository
public class UsersDatasource implements UsersRepository {
    @Autowired
    UsersMapper usersMapper;

    @Override
    public User findUser(UserId requestUserId) {
        return usersMapper.findUser(requestUserId);
    }
}
