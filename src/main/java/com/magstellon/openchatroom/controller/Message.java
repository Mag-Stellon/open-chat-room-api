package com.magstellon.openchatroom.controller;

import com.magstellon.openchatroom.services.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Message {

    private MessageService messageService;

    @Autowired
    public Message (final MessageService messagesService) {
        this.messageService = messagesService;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/message")
    public ResponseEntity<String> message(@RequestBody String request) {
        return new ResponseEntity<>(this.messageService.addMessage(request) ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
