package com.example.kanban_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.Map;

@RestController
@RequestMapping("/api/greeting")
public class GreetingController {
    @GetMapping
    public Mono<Map<String, String>> greet() {
        return Mono.just(Map.of("message", "Hello, World!"));
    }
}