package com.magstellon.openchatroom.repositories;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.magstellon.openchatroom.entities.Message;

import org.apache.commons.collections4.queue.CircularFifoQueue;
import org.springframework.stereotype.Repository;

@Repository
public class MessagesRepositoryInMemory implements MessagesRepository {
    private CircularFifoQueue<Message> history;

    public MessagesRepositoryInMemory () {
        this.history = new CircularFifoQueue<Message>(5);
    }

    @Override
    public boolean addMessage (String content) {
        return this.history.add(new Message(content));
    }

    @Override
    public String toJSON () throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(this.history.toArray());
    }
}
