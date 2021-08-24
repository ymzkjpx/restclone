package rest.clone.presentation.view.error;

import org.springframework.validation.FieldError;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Errors {
    public List<Error> errors;

    public Errors(Error error) {
        this.errors = Collections.singletonList(error);
    }

    public Errors(ErrorType errorType, String message) {
        this(new Error(errorType, message));
    }

    public Errors(ErrorType errorType, Exception exception) {
        this(new Error(errorType, exception.getMessage()));
    }

    public Errors(List<FieldError> fieldErrors) {
        this.errors = new ArrayList<>();
        fieldErrors.forEach(fieldError -> this.errors.add(new Error(fieldError)));
    }
}
