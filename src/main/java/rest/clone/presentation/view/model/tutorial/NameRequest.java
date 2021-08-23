package rest.clone.presentation.view.model.tutorial;

public class NameRequest {
    String name;

    @Deprecated
    NameRequest() {}

    public NameRequest(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public String value(){
        return name();
    }

    @Override
    public String toString() {
        return "NameRequest{" + "name='" + name + '\'' + '}';
    }
}
