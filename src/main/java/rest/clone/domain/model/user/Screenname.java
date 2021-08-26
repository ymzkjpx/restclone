package rest.clone.domain.model.user;

public class Screenname {
    String value;

    @Deprecated
    Screenname(){}

    public Screenname(String value) {
        this.value = value;
    }

    public String value(){
        return value;
    }

    @Override
    public String toString() {
        return "ScreenName{" + "value='" + value + '\'' + '}';
    }
}
