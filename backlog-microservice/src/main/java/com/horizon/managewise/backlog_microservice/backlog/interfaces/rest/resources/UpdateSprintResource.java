package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.valueobjects.SprintStatus;

public record UpdateSprintResource (
        String title,
        String goal,
        SprintStatus status
) {
}
