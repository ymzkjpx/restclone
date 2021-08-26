package rest.clone.presentation.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rest.clone.application.service.users.UsersQueryService;
import rest.clone.domain.model.user.UserIds;
import rest.clone.domain.model.user.Users;
import rest.clone.presentation.view.model.users.UserIdsRequest;
import rest.clone.presentation.view.model.users.UsersResponse;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    UsersQueryService usersQueryService;

    @RequestMapping(value = "by/username/{id}", method = RequestMethod.GET)
    UsersResponse byUsername(@PathVariable("id") UserIdsRequest ids ){
        UserIds userIds = ids.asUserIds();
        Users users = usersQueryService.findUsers(userIds);
        return UsersResponse.from(users);
    }
}
