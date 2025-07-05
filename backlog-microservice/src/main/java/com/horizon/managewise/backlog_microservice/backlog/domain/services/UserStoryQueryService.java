package com.horizon.managewise.backlog_microservice.backlog.domain.services;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.UserStory;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.entities.TaskItem;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetAllUserStoriesQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetAllTaskItemsByUserStoryIdQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetUserStoryByIdQuery;

import java.util.List;
import java.util.Optional;

public interface UserStoryQueryService {
    List<UserStory> handle(GetAllUserStoriesQuery query);
    Optional<UserStory> handle(GetUserStoryByIdQuery query);

    List<TaskItem> handle(GetAllTaskItemsByUserStoryIdQuery query);
}
