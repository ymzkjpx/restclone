package rest.clone.presentation.view.error;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

public class CustomErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
         Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
        // 必要に応じて書き換える. 下記は実装の雰囲気.
//        Map<String, Object> errorAttributes = new LinkedHashMap<String, Object>();
//        errorAttributes.put("timestamp", new Date());
        return errorAttributes;
    }
}