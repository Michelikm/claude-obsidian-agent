package com.obsidianai.controller;

import com.obsidianai.model.MemoryEntry;
import com.obsidianai.service.MemoryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MemoryController {

    private final MemoryService memoryService;

    public MemoryController(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @PostMapping("/memory/remember")
    public ResponseEntity<MemoryEntry> remember(@RequestBody MemoryEntry memoryEntry) {
        return ResponseEntity.ok(memoryService.save(memoryEntry));
    }

    @PostMapping("/memory/search")
    public ResponseEntity<List<MemoryEntry>> search(@RequestBody Map<String, String> payload) {
        String query = payload.getOrDefault("query", "");
        return ResponseEntity.ok(memoryService.search(query));
    }

    @GetMapping("/memory")
    public ResponseEntity<List<MemoryEntry>> all() {
        return ResponseEntity.ok(memoryService.findAll());
    }
}
