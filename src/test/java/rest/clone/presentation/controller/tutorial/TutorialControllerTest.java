package rest.clone.presentation.controller.tutorial;

import io.restassured.response.Response;
import org.apache.commons.validator.GenericValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import rest.clone.GreetingApiTest;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertTrue;


@GreetingApiTest
@AutoConfigureMockMvc
class TutorialControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void チュートリアルGETメソッド() {
        String name = "サトシ";
        Response response = given().when()
                                   .get("/api/tutorial?name=" + name)
                                   .then()
                                   .extract()
                                   .response();

        Assertions.assertEquals(name,
                response.jsonPath()
                        .getString("name"));
        assertTrue(GenericValidator.isDate(response.jsonPath()
                                                   .getString("now"), "yyyy/MM/dd HH:mm:ss", true));
    }

    @Test
    public void チュートリアルPOSTメソッド() throws Exception {
        String name = "Alice";
        Response response = given().header("Content-Type", "application/json")
                                   .and()
                                   // TODO: 2021/08/23 JSONオブジェクトをBuilderチックに作成できるようにする。
                                   .body("{\"name\":\"Alice\"}")
                                   .when()
                                   .post("/api/tutorial")
                                   .then()
                                   .extract()
                                   .response();

        Assertions.assertEquals(name,
                response.jsonPath()
                        .getString("name"));
        assertTrue(GenericValidator.isDate(response.jsonPath()
                                                   .getString("now"), "yyyy/MM/dd HH:mm:ss", true));
    }
}