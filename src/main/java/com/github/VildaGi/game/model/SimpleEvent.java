package com.github.VildaGi.game.model;

import java.time.LocalDate;

public class SimpleEvent {
    private final String description;

    private final LocalDate createdDate;

    private final LocalDate endTime;

    private EventStatus status = EventStatus.CREATED;

    public SimpleEvent(String description, LocalDate createdDate, LocalDate endTime, EventStatus status) {
        this.description = description;
        this.createdDate = createdDate;
        this.endTime = endTime;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getEndTime() {
        return endTime;
    }

    public EventStatus getStatus() {
        return status;
    }

    public void setStatus(EventStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SimpleEvent{" +
                "description='" + description + '\'' +
                ", createdDate=" + createdDate +
                ", endTime=" + endTime +
                ", status=" + status +
                '}';
    }

    public SimpleEvent copy() {
        return new SimpleEvent(description, createdDate, endTime, status);
    }
}
