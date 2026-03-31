package com.example.whatsappChatbot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private static final Logger logger = LoggerFactory.getLogger(MessageService.class);

    public String processMessage(String message) {
        logger.info("Incoming message: {}", message);

        if (message == null) return "Invalid input";

        switch (message.trim().toLowerCase()) {
            case "hi":
                return "Hello";
            case "bye":
                return "Goodbye";
            default:
                return "I don’t understand";
        }
    }
}