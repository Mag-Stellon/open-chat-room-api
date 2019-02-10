package com.magstellon.openchatroom.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    private final MessageService service;

    @Autowired
    public MessageController (MessageService service){
        this.service = service;
    }
    
    @MessageMapping("/public")
    @SendTo("/channel/public")
    public MessageResponse message(MessageRequest message, SimpMessageHeaderAccessor  headerAccessor) {
        message.setId(headerAccessor.getSessionId());
        return new MessageResponse(service.getMessageOwnerName(message),message.getContent());
    }

}
