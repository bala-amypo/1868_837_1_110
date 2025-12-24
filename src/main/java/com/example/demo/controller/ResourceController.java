package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/resources")
public class ResourceController {

    @GetMapping
    public List<String> getAll() {
        return List.of("Projector", "Room");
    }
}
