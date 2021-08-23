package rest.clone.presentation.view.model.tutorial;

import rest.clone.domain.model.tutorial.NowGreeting;

public class NowGreetingResponse {
    String name;
    String now;

    @Deprecated
    NowGreetingResponse() {}

    public NowGreetingResponse(NowGreeting nowGreeting) {
        this.name = nowGreeting.name();
        this.now  = nowGreeting.now()
                               .format();
    }

    @Override
    public String toString() {
        return "NowGreetingResponce{" + "name='" + name + '\'' + ", now='" + now + '\'' + '}';
    }
}
