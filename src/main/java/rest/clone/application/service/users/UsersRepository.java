package rest.clone.application.service.users;

import org.springframework.web.bind.annotation.RequestMapping;
import rest.clone.domain.model.user.UserIds;
import rest.clone.domain.model.user.Users;

@RequestMapping
public interface UsersRepository {
    Users findUsers(UserIds userIds);
}