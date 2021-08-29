package rest.clone.presentation.controller.message;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rest.clone.domain.model.message.MessageRequest;

@RestController
@RequestMapping("/api/message")
public class messageController {

   @RequestMapping(value = "new", method = RequestMethod.POST)
    void newMessage(@RequestBody MessageRequest messageRequest){
       System.out.println(messageRequest.value());
   }
}
