package rest.clone.domain.model.tutorial;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import rest.clone.domain.model.material.time.RequestDateTime;
import rest.clone.presentation.view.model.tutorial.CustomRequestDateSerializer;

import java.time.LocalDate;

public class NowGreeting {
    @JsonSerialize(using = CustomRequestDateSerializer.class)
    String name;
    RequestDateTime now = RequestDateTime.now();

    @Deprecated
    NowGreeting(){}

    public NowGreeting(String name){
        this.name = name;
        this.now = RequestDateTime.now();
    }

    public NowGreeting(String  name, LocalDate localDate) {
        this.name = name;
        this.now = RequestDateTime.from(localDate);
    }

    public String name(){
        return name;
    }

    public RequestDateTime now(){
        return now;
    }
}
