package com.magstellon.openchatroom.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.magstellon.openchatroom.services.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class Messages {

    private MessageService messageService;

    @Autowired
    public Messages (final MessageService messagesService) {
        this.messageService = messagesService;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/messages", produces = "application/json")
    public String messages() {
        try {
            return this.messageService.toJSON();
        } catch (JsonProcessingException e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
