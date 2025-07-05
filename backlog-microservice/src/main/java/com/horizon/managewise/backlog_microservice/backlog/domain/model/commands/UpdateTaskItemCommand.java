package com.horizon.managewise.backlog_microservice.backlog.domain.model.commands;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.valueobjects.Status;

public record UpdateTaskItemCommand(Long taskId, Long userStoryId, String title, String description, Status status, Integer estimation) {
}
