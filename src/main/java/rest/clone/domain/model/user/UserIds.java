package rest.clone.domain.model.user;

import rest.clone.presentation.view.model.users.UserId;

import java.util.List;

public class UserIds {
    List<UserId> list;

    public UserIds(List<UserId> list){
        this.list = list;
    }
    public List<UserId> asList(){
        return list;
    }
}
