package rest.clone.presentation.view.model.users;

import lombok.NonNull;

public class UserId {
    @NonNull
    Integer value;

    @Deprecated
    UserId(){}

    public UserId(@NonNull Integer value) {
        this.value = value;
    }

    public Integer value(){
        return value;
    }

    @Override
    public String toString() {
        return "UserId{" + "value=" + value + '}';
    }
}
