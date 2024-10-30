package com.chating.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.chating.messager.message;

import org.springframework.messaging.simp.SimpMessagingTemplate;

@Controller
public class control {

    @SuppressWarnings("unused")
    private final SimpMessagingTemplate messagingTemplate;

    public control(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public message sendMessage(message chatMessage) {
        return chatMessage;
    }

    @SuppressWarnings("null")
    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public message addUser(message chatMessage, SimpMessageHeaderAccessor headerAccessor) {
        headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }
}



