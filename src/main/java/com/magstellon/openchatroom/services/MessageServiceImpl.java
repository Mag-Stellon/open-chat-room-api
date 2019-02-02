package com.magstellon.openchatroom.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.magstellon.openchatroom.repositories.MessagesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    private MessagesRepository messagesRepository;

    @Autowired
    public MessageServiceImpl (final MessagesRepository repository) {
        this.messagesRepository = repository;
    }

    @Override
    public boolean addMessage (String content) {
        return this.messagesRepository.addMessage(content);
    }

    @Override
    public String toJSON () throws JsonProcessingException {
        return this.messagesRepository.toJSON();
    }
}
