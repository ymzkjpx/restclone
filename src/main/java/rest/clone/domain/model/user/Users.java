package rest.clone.domain.model.user;

import java.util.List;

public class Users {
    List<User> list;

    public Users(List<User> list){
        this.list = list;
    }

    public List<User> asList(){
        return list;
    }
}
