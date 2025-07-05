package com.horizon.managewise.backlog_microservice.backlog.domain.model.commands;

public record DeleteTaskCommand(Long userStoryId, Long taskId) {
}
