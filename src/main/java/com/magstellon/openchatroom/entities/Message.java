package com.magstellon.openchatroom.entities;

import java.util.concurrent.atomic.AtomicLong;

public class Message {
    private static AtomicLong counter = new AtomicLong();

    private final long id;
    private final String content;

    public Message(String content) {
        this.id = Message.counter.incrementAndGet();
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
}
