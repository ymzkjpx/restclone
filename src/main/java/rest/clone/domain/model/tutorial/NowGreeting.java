package rest.clone.domain.model.tutorial;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import rest.clone.domain.model.material.time.RequestDate;
import rest.clone.presentation.view.model.tutorial.CustomRequestDateSerializer;

import java.time.LocalDate;

public class NowGreeting {
    @JsonSerialize(using = CustomRequestDateSerializer.class)
    String name;
    RequestDate now = RequestDate.now();

    @Deprecated
    NowGreeting(){}

    public NowGreeting(String name){
        this.name = name;
        this.now = RequestDate.now();
    }

    public NowGreeting(String  name, LocalDate localDate) {
        this.name = name;
        this.now = RequestDate.from(localDate);
    }

    public String name(){
        return name;
    }

    public RequestDate now(){
        return now;
    }
}
