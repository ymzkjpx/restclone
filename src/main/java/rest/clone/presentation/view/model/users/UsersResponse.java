package rest.clone.presentation.view.model.users;

import rest.clone.domain.model.user.Users;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UsersResponse {
    List<UserResponse> users;

    public UsersResponse(List<UserResponse> list) {
        this.users = list;
    }

    public static UsersResponse from(Users users) {
        List<UserResponse> userResponses = new ArrayList<>();
        userResponses = users.asList()
                             .stream()
                             .map(user -> new UserResponse(user))
                             .collect(Collectors.toList());
        return new UsersResponse(userResponses);
    }
}
