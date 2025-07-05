package com.horizon.managewise.backlog_microservice.backlog.application.internal.queryservices;

import org.springframework.stereotype.Service;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.UserStory;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.entities.TaskItem;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetAllUserStoriesQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetAllTaskItemsByUserStoryIdQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetUserStoryByIdQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.services.UserStoryQueryService;
import com.horizon.managewise.backlog_microservice.backlog.infrastructure.persistence.jpa.repositories.UserStoryRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserStoryQueryServiceImpl implements UserStoryQueryService {
    private final UserStoryRepository userStoryRepository;

    public UserStoryQueryServiceImpl(UserStoryRepository userStoryRepository) {
        this.userStoryRepository = userStoryRepository;
    }

    @Override
    public List<UserStory> handle(GetAllUserStoriesQuery query){
        return this.userStoryRepository.findAll();
    }

    @Override
    public Optional<UserStory> handle(GetUserStoryByIdQuery query){
        return this.userStoryRepository.findById(query.userStoryId());
    }

    @Override
    public List<TaskItem> handle(GetAllTaskItemsByUserStoryIdQuery query){
        return List.of();
    }
}