package com.obsidianai.model;

import java.time.Instant;
import java.util.UUID;

public class MemoryEntry {
    private String id;
    private String title;
    private String content;
    private String source;
    private String tags;
    private Instant createdAt;

    public MemoryEntry() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = Instant.now();
    }

    public MemoryEntry(String title, String content, String source, String tags) {
        this();
        this.title = title;
        this.content = content;
        this.source = source;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
