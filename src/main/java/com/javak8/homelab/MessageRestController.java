package com.javak8.homelab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageRestController {
    private static final Logger logger = LoggerFactory.getLogger(MessageRestController.class);

    @PostMapping("/api/log")
    public void logMessage(@RequestBody Message message) {
        logger.info("+++++++++++++REST message received: {}", message.getContent());
    }
}
