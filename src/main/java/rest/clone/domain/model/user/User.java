package rest.clone.domain.model.user;

import rest.clone.presentation.view.model.users.UserId;

public class User {
    UserId userId;
    Screenname screenname;

    @Deprecated
    User() {}

    public User(UserId userId, Screenname screenname) {
        this.userId     = userId;
        this.screenname = screenname;
    }

    public UserId userId() {
        return userId;
    }

    public Screenname screenName() {
        return screenname;
    }
}
