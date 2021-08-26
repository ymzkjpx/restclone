package rest.clone.application.service.users;

import org.springframework.web.bind.annotation.RequestMapping;
import rest.clone.domain.model.user.User;
import rest.clone.presentation.view.model.users.UserId;

@RequestMapping
public interface UsersRepository {
    User findUser(UserId userId);
}
