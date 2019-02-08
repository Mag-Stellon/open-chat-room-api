package com.magstellon.openchatroom.message;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

@Controller
public class MessageController {
    
    @MessageMapping("/messages")
    @SendTo("/topic/messages")
    public Message message(Message message) {
        return message;
    }

}
