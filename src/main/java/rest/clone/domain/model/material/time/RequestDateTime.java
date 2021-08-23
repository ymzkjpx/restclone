package rest.clone.domain.model.material.time;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RequestDateTime {

    @JsonSerialize(using = LocalDateSerializer.class)
    LocalDateTime value;

    @Deprecated
    RequestDateTime() {}

    private RequestDateTime(LocalDateTime value) {
        this.value = value;
    }

    public static RequestDateTime now() {
        return new RequestDateTime(LocalDateTime.now());
    }

    public static RequestDateTime from(LocalDate localDate) {
        return new RequestDateTime(LocalDateTime.from(localDate));
    }

    public static RequestDateTime parse(String textDate) {
        return new RequestDateTime(LocalDateTime.parse(textDate));
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
