package rest.clone.presentation.controller.tutorial;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.RestClientTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import rest.clone.GreetingApiTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;

@GreetingApiTest
@AutoConfigureMockMvc
class TutorialControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void チュートリアルGETのレスポンスを返せること() {
        String name = "サトシ";
        given().when()
               .get("/api/tutorial?name=" + name)
               .then()
               .body("name", equalTo(name))
               // TODO: 2021/08/23 日付フォーマットで比較検証できるようにする.方法が分からなかったので、一旦NULLでない検証に留める.
               .body("now", notNullValue());
    }
}