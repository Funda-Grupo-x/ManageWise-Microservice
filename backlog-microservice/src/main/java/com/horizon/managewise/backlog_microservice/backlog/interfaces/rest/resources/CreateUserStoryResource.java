package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources;

public record CreateUserStoryResource(
        String title,
        String description,
        Long epicId,
        Long sprintId,
        Integer effort) {
}
