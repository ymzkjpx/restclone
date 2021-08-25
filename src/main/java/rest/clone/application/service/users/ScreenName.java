package rest.clone.application.service.users;

public class ScreenName {
    String value;

    ScreenName(){}

    public ScreenName(String value) {
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
