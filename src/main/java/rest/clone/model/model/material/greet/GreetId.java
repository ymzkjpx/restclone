package rest.clone.model.model.material.greet;

public class GreetId {
    Integer value;

    @Deprecated
    GreetId(){}

    public GreetId(Integer value) {
        this.value = value;
    }

    public Integer value(){
        return value;
    }

    public String format(){
        return Integer.toString(value);
    }

    @Override
    public String toString() {
        return "Id{" + "value=" + value + '}';
    }
}
