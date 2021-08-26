package rest.clone.application.service.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rest.clone.domain.model.user.User;
import rest.clone.presentation.view.model.users.UserId;

@Service
public class UsersQueryService {
    @Autowired
    UsersRepository usersRepository;

    // TODO: 2021/08/25 最初はUserを取得する仕様とする. のちほどUsersで取得できるように変更する.
    public User findUsers(String id){
        UserId userId = new UserId(Integer.valueOf(id));
        return usersRepository.findUser(userId);
    }

}
