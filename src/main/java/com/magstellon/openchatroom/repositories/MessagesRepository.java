package com.magstellon.openchatroom.repositories;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface MessagesRepository {
    boolean addMessage (String content);
    String toJSON() throws JsonProcessingException;
}
