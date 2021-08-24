package rest.clone.presentation.view.error;

import org.springframework.validation.FieldError;

public class Error {
    public ErrorType errorType;
    public String message;

    public Error(ErrorType errorType, String message) {
        this.errorType = errorType;
        this.message   = message;
    }

    public Error(FieldError error) {
        this.errorType = ErrorType.FieldError;
        this.message   = String.format("Field = '%s': rejected value = '%s': %s,",
                error.getField(),
                error.getRejectedValue(),
                error.getDefaultMessage());
    }
}
