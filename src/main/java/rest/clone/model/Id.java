package rest.clone.model;

public class Id {
    Integer value;

    @Deprecated
    Id(){}

    public Id(Integer value) {
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
