package rest.clone.presentation.view.model.greeting;

import rest.clone.domain.model.greeting.GreetingHistory;

import java.util.ArrayList;
import java.util.List;

public class HistoryResponse {
    List<GreetingResponse> list;

    public HistoryResponse(List<GreetingResponse> list) {
        this.list = list;
    }

    //GreetingHistory <*--1> Greeting <1--1> GreetingResponse <1--*> HistoryResponse
    public static HistoryResponse from(GreetingHistory history) {
        List<GreetingResponse> greetingResponses = new ArrayList<>();
        history.asList()
               .forEach(greeting -> greetingResponses.add(new GreetingResponse(greeting)));
        return new HistoryResponse(greetingResponses);
    }
}
