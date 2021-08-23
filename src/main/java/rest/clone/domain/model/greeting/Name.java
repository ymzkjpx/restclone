package rest.clone.domain.model.greeting;

public class Name {
    String value;

    @Deprecated
    Name() {}

    public Name(String value) {
        this.value = value;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "Name{" + "value='" + value + '\'' + '}';
    }
}