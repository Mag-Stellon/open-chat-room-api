package com.magstellon.openchatroom.message;

import java.util.HashMap;

import com.github.javafaker.Faker;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    
    private final HashMap<String, String> sessions;

    public MessageService(){
        sessions = new HashMap<String, String>();
    }

    public String getMessageOwnerName(MessageRequest message) {
        if(!sessions.containsKey(message.getId())){
            sessions.put(message.getId(), new Faker().name().firstName());
        }

        return sessions.get(message.getId());
    }
}
