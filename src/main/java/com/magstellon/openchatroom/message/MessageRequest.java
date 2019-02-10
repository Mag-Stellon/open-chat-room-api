package com.magstellon.openchatroom.message;

public class MessageRequest {

    private String content;
    private String id;

    public MessageRequest() {};

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(String socketId) {
        id = socketId;
    }

}
