package com.obsidianai.service;

import com.obsidianai.model.MemoryEntry;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MemoryService {

    private final Map<String, MemoryEntry> inMemoryStore = new HashMap<>();

    public MemoryEntry save(MemoryEntry memoryEntry) {
        if (memoryEntry.getId() == null || memoryEntry.getId().isBlank()) {
            memoryEntry.setId(UUID.randomUUID().toString());
        }
        inMemoryStore.put(memoryEntry.getId(), memoryEntry);
        return memoryEntry;
    }

    public List<MemoryEntry> search(String query) {
        if (query == null || query.isBlank()) {
            return findAll();
        }

        String normalized = query.toLowerCase(Locale.ROOT);
        return inMemoryStore.values().stream()
                .filter(entry ->
                        (entry.getTitle() != null && entry.getTitle().toLowerCase(Locale.ROOT).contains(normalized)) ||
                        (entry.getContent() != null && entry.getContent().toLowerCase(Locale.ROOT).contains(normalized)) ||
                        (entry.getTags() != null && entry.getTags().toLowerCase(Locale.ROOT).contains(normalized))
                )
                .toList();
    }

    public List<MemoryEntry> findAll() {
        return new ArrayList<>(inMemoryStore.values());
    }
}
