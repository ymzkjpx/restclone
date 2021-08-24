package rest.clone.presentation.view.error;

import org.apache.ibatis.jdbc.Null;
import org.springframework.validation.FieldError;

public enum ErrorType {
    BadRequest("400"),
    Unauthorized("401"),
    Forbidden("403"),
    NotFound("404"),
    Unknown("500"),
    FieldError("FieldError");

    String errorCode;

    ErrorType(String errorCode) {
        this.errorCode = errorCode;
    }

    public String errorCode() {
        return errorCode;
    }
}
