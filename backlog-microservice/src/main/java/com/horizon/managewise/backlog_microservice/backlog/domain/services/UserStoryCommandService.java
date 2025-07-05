package com.horizon.managewise.backlog_microservice.backlog.domain.services;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.UserStory;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.*;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.entities.TaskItem;

import java.util.Optional;

public interface UserStoryCommandService {
    Long handle(CreateUserStoryCommand command);
    Optional<UserStory> handle(UpdateUserStoryCommand command);
    void handle(DeleteUserStoryCommand command);


    Long handle(CreateTaskITemByUserStoryIdCommand command);
    boolean handle(DeleteTaskCommand command);
    Optional<TaskItem> handle(UpdateTaskItemCommand command);
}
