package com.example.whatsappChatbot.controller;

import com.example.whatsappChatbot.model.MessageRequest;
import com.example.whatsappChatbot.service.MessageService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private final MessageService messageService;

    public WebhookController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping
    public String receiveMessage(@RequestBody MessageRequest request) {
        return messageService.processMessage(request.getMessage());
    }
}
