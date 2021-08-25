package rest.clone.presentation.view.error;

public enum ErrorType {
    BadRequest(400),
    Unauthorized(401),
    Forbidden(403),
    NotFound(404),
    Unknown(500),
    FieldError(null);

    Integer errorCode;

    ErrorType(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Integer errorCode() {
        return errorCode;
    }
}
