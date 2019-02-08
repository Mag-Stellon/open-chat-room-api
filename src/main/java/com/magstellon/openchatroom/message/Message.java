package com.magstellon.openchatroom.message;

import java.util.UUID;

public class Message {

    private UUID id;
    private String content;
    private String avatar;

    public Message () {
        id = UUID.randomUUID();
        avatar = "https://ui-avatars.com/api/?background=0D8ABC&color=fff";
    };

    public UUID getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAvatar() {
        return avatar;
    }

}
