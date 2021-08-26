package rest.clone.infrastructure.datasource.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rest.clone.application.service.users.UsersRepository;
import rest.clone.domain.model.user.User;
import rest.clone.domain.model.user.UserIds;
import rest.clone.domain.model.user.Users;

import java.util.List;

@Repository
public class UsersDatasource implements UsersRepository {
    @Autowired
    UsersMapper usersMapper;

    @Transactional
    @Override
    public Users findUsers(UserIds userIds) {
        List<User> list = usersMapper.findUsers(userIds);
        return new Users(list);
    }
}
