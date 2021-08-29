package rest.clone.domain.model.message;

public class MessageRequest {
    String value;

    @Deprecated
    MessageRequest(){}

    public MessageRequest(String value) {
        this.value = value;
    }

    public String value(){
        return value;
    }

    @Override
    public String toString() {
        return "MessageRequest{" + "value='" + value + '\'' + '}';
    }
}
