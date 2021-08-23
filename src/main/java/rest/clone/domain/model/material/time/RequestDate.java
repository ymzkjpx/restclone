package rest.clone.domain.model.material.time;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RequestDate {

    @JsonSerialize(using = LocalDateSerializer.class)
    LocalDateTime value;

    @Deprecated
    RequestDate() {}

    private RequestDate(LocalDateTime value) {
        this.value = value;
    }

    public static RequestDate now() {
        return new RequestDate(LocalDateTime.now());
    }

    public static RequestDate from(LocalDate localDate) {
        return new RequestDate(LocalDateTime.from(localDate));
    }

    public static RequestDate parse(String textDate) {
        return new RequestDate(LocalDateTime.parse(textDate));
    }

    public LocalDateTime value(){
        return value;
    }

    public String asString(){
        return value.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }

    public String format(){
        return value.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }

    @Override
    public String toString() {
        return "RequestDate{" + "value=" + value + '}';
    }
}
