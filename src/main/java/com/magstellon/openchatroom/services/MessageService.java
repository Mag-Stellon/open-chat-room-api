package com.magstellon.openchatroom.services;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface MessageService {
    boolean addMessage (String content);
    String toJSON() throws JsonProcessingException;
}
