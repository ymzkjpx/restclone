package rest.clone.presentation;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import rest.clone.presentation.view.error.CustomErrorAttributes;

@ControllerAdvice(basePackageClasses = BaseControllerAdvice.class)
public class BaseControllerAdvice {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.setAllowedFields();
        webDataBinder.initDirectFieldAccess();
        webDataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(false));
    }
    @Bean
    public ErrorAttributes errorAttributes() {
        return new CustomErrorAttributes();
    }
}
