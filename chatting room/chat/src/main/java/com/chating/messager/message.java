package com.chating.messager;

public class message {

    private String sender;
    private String content;
    private MessageType type;

    public enum MessageType {
        CHAT, JOIN, LEAVE
    }

    


    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    // Getter and Setter for content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Getter and Setter for type
    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }
}
