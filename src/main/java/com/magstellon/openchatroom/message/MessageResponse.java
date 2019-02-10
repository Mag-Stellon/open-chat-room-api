package com.magstellon.openchatroom.message;

import java.sql.Timestamp;

public class MessageResponse {

    private String name;
    private String content;
    private long timestamp;
    private String avatar;

    public MessageResponse (String name, String content) {
        avatar = "https://ui-avatars.com/api/?background=0D8ABC&color=fff";
        this.content = content;
        this.name = name;
        timestamp = new Timestamp(System.currentTimeMillis()).getTime();
    };

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    
    public Long getTimestamp() {
        return timestamp;
    }

    public String getAvatar() {
        return avatar;
    }

}
