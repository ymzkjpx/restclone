package rest.clone.presentation.view.model.users;

import rest.clone.domain.model.user.User;

public class UserResponse {
    Integer id;
    String name;

    @Deprecated
    UserResponse(){}

    public UserResponse(User user){
        this.id   = user.userId().value();
        this.name = user.screenName().value();
    }

    public Integer id(){
        return id;
    }

    public String name(){
        return name;
    }

    @Override
    public String toString() {
        return "UserResponse{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
