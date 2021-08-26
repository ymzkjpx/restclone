package rest.clone.presentation.controller.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rest.clone.application.service.users.UsersQueryService;
import rest.clone.domain.model.user.User;
import rest.clone.presentation.view.model.users.UserResponse;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @Autowired
    UsersQueryService usersQueryService;

    @RequestMapping(value = "by/username/{id}", method = RequestMethod.GET)
    List<String> byUsername(@PathVariable("id")String ids ){
        List<String> list = Arrays.asList(ids.split(","));
        return list;
    }
}
