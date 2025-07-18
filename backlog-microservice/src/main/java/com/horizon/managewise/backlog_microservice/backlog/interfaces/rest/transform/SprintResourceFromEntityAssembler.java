package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Sprint;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.SprintResource;

public class SprintResourceFromEntityAssembler {
    public static SprintResource toResourceFromEntity(Sprint sprint) {
        return new SprintResource(sprint.getId(), sprint.getTitle(), sprint.getGoal(), sprint.getEndDate(), sprint.getStartDate(), sprint.getStatus());
    }
}
