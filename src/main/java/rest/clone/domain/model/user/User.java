package rest.clone.domain.model.user;

import rest.clone.application.service.users.ScreenName;
import rest.clone.application.service.users.UserId;

public class User {
    UserId userId;
    ScreenName screenName;

    @Deprecated
    User(){}

    public User(Integer userId, ScreenName screenName) {
        UserId          = userId;
        this.screenName = screenName;
    }

    public UserId userId(){
        return userId;
    }

    public ScreenName screenName(){
        return screenName;
    }
}
