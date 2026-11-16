package com.example.grades;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping({"/api/health", "/health"})
    public Map<String, String> health() {
        logger.info("Health check called");
        return Map.of("status", "Abdulaziz");
    }
}