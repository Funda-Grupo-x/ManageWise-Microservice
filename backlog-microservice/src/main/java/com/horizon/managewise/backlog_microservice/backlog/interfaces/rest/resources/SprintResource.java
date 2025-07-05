package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.valueobjects.SprintStatus;

import java.util.Date;

public record SprintResource(Long id, String title, String goal, Date endDate, Date startDate, SprintStatus status) {
}
