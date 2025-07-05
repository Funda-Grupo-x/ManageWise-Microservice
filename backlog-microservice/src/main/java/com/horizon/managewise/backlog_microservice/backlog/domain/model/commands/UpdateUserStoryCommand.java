package com.horizon.managewise.backlog_microservice.backlog.domain.model.commands;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.valueobjects.Status;

public record UpdateUserStoryCommand(Long id, String title, String description, Long epicId, Long SprintId, Status status, Integer effort) {
}
