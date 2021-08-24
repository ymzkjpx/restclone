package rest.clone.presentation.view.error;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

public class CustomErrorAttribute extends DefaultErrorAttributes {

    /**
     * そもそも、DefaultErrorAttributesはエラー情報を表に露出させないようにする目的でオーバーライドしている。
     * デフォルトの設定ではエラー情報が表に露出してしまっているので、セキュリティ要件としてデフォルトの設定を変更している。
     *
     * SpringFramework: 2.2 → 2.3で仕様変更があった。
     * FYI: https://github.com/spring-projects/spring-boot/blob/v2.3.1
     * .RELEASE/spring-boot-project/spring-boot/src/main/java/org/springframework/boot/web/reactive/error/DefaultErrorAttributes.java#L87
     */
    @Override
    public Map<String , Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options){
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, options);
        // 必要に応じて書き換える
        return errorAttributes;
    }
}
