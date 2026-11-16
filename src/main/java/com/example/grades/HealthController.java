package com.example.grades;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HealthController {

    private static final Logger logger = LoggerFactory.getLogger(HealthController.class);

    @GetMapping({"/api/health", "/health"})
    public Map<String, String> health() {
        logger.info("Health check called");
        return Map.of("status", "Abdulaziz");
    }
}