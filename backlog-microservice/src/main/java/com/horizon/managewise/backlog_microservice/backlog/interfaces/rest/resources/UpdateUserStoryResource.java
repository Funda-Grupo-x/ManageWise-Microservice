package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.valueobjects.Status;

public record UpdateUserStoryResource(
        String title,
        String description,
        Long epicId,
        Long sprintId,
        Status status,
        Integer effort
) {
}
