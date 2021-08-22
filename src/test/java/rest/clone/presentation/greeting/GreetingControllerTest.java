package rest.clone.presentation.greeting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import rest.clone.GreetingApiTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@GreetingApiTest
@AutoConfigureMockMvc
class GreetingControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void 挨拶した名前を返す(){
        given().when().get("/greeting/chiwa").then().body("name.value", equalTo("anonymous"));
    }
}