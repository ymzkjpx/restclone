package rest.clone.presentation.view.validation.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.Pattern;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Pattern(regexp="[0-9,]")
@Documented
@Constraint(validatedBy = {})
public @interface OnlyIdAndCommaAnnotation {
    String message() default "";

    boolean allowNull() default false;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @interface List {
        OnlyIdAndCommaAnnotation[] value();
    }
}
