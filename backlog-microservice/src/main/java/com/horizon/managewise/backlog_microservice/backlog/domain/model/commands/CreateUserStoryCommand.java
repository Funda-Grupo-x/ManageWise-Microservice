package com.horizon.managewise.backlog_microservice.backlog.domain.model.commands;

import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.TaskItemResource;

import java.util.List;

public record CreateUserStoryCommand(
        String title,
        String description,
        Long epicId,
        Long sprintId,
        Integer effort,
        List<TaskItemResource> tasks)
{}
