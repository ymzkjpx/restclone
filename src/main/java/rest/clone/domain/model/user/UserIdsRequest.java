package rest.clone.domain.model.user;

import rest.clone.presentation.view.model.users.UserId;

import java.util.Arrays;
import java.util.List;

public class UserIdsRequest {
    List<UserId> list;

    public UserIdsRequest(List<UserId> list) {
        this.list = list;
    }

    public UserIdsRequest(String nonSplitRequest){
        List<String> stringList = Arrays.asList(nonSplitRequest.split(","));
        new Users(stringList.stream((e)->new User(e.i)))
    }

    public List<UserId> asList(){
        return list;
    }
}
