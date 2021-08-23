package rest.clone.presentation.greeting;

import org.apache.commons.validator.GenericValidator;
import org.apache.commons.validator.Validator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import rest.clone.GreetingApiTest;
import rest.clone.domain.model.material.time.RequestDateTime;
import rest.clone.valid.DateTimeValicatorUsingDateTImeFormat;
import rest.clone.valid.DateTimeValidator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@GreetingApiTest
@AutoConfigureMockMvc
class GreetingControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    public void チュートリアルGETのレスポンスを返せること() {
        String name = "サトシ";
        given().when()
               .get("/api/greeting?name=" + name)
               .then()
               .body("name", equalTo(name))
               // TODO: 2021/08/23 日付フォーマットで比較検証できるようにする.方法が分からなかったので、一旦NULLでない検証に留める. 
               .body("now", notNullValue());
    }

    @Test
    public void test() {
    }

    @Test
    public void 名前なしならデフォルト値を返却する() {
        given().when()
               .get("/greeting/chiwa")
               .then()
               .body("name.value", equalTo("anonymous"));
    }

    @Test
    public void 挨拶した名前を返す() {
        String name = "有紗";
        given().when()
               .get("/greeting/chiwa?name=" + name)
               .then()
               .body("name.value", equalTo(name));
    }
}