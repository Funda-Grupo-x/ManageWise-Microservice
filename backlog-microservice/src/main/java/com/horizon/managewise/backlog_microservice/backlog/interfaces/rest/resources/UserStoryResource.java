package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.valueobjects.Status;

import java.util.List;

public record UserStoryResource(
        Long id,
        String title,
        String description,
        Long epicId,
        Long sprintId,
        Integer effort,
        Status status,
        List<TaskItemResource> tasks) {
}
