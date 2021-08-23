package rest.clone.domain.model.greeting;

public class GreetId {
    Integer value;

    @Deprecated
    GreetId() {}

    public GreetId(Integer value) {
        this.value = value;
    }

    public GreetId(String textValue) {
        this.value = Integer.parseInt(textValue);
    }

    public Integer value() {
        return value;
    }

    public String format() {
        return Integer.toString(value);
    }

    @Override
    public String toString() {
        return "GreetId{" + "value=" + value + '}';
    }
}
