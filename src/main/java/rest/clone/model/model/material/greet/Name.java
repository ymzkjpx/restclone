package rest.clone.model.model.material.greet;

public class Name {
    String value;

    @Deprecated
    Name(){}

    public Name(String value) {
        this.value = value;
    }

    public String value(){
        return value;
    }

    @Override
    public String toString() {
        return "Name{" + "value='" + value + '\'' + '}';
    }
}