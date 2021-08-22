package rest.clone.model.model.greeting;

public class GreetingRequest {
    String value;

    @Deprecated
    GreetingRequest(){}

    public GreetingRequest(String value) {
        this.value = value;
    }

    public String  value(){
        return value;
    }

    @Override
    public String toString() {
        return "GreetingRequest{" + "value='" + value + '\'' + '}';
    }
}
