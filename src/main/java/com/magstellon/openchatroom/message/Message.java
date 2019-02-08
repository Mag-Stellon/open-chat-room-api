package com.magstellon.openchatroom.message;

import java.util.UUID;

public class Message {

    private UUID id;
    private String content;

    public Message(String content) {
        this.id = UUID.randomUUID();
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
