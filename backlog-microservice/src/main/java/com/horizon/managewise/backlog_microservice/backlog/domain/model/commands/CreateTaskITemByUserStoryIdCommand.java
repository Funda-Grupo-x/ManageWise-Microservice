package com.horizon.managewise.backlog_microservice.backlog.domain.model.commands;

public record CreateTaskITemByUserStoryIdCommand(Long userStoryId, String title, String description, Integer estimation) {}