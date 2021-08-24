package rest.clone.presentation.controller.greeting;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
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
    public void 名前なしならデフォルト値を返却する() {
        given().when()
               .get("/api/greeting")
               .then()
               .body("name", equalTo("anonymous"));
    }

    @Test
    public void 挨拶した名前を返す() {
        String name = "有紗";
        given().when()
               .get("/api/greeting/chiwa?name=" + name)
               .then()
               .body("name", equalTo(name));
    }


    @Test
    public void 挨拶履歴を取得できる() {
        Response response = given().when()
                                   .get("/api/greeting/history")
                                   .then()
                                   .body("list[0].id", equalTo("1"))
                                   .extract()
                                   .response();

        Assertions.assertEquals(3,
                response.jsonPath()
                        .getList("list")
                        .size());
    }
}