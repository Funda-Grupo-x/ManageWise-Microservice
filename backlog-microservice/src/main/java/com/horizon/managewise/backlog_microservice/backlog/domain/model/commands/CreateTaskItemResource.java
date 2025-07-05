package com.horizon.managewise.backlog_microservice.backlog.domain.model.commands;

public record CreateTaskItemResource(String title, String description, Integer estimation) {
}
