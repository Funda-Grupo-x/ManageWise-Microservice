package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.valueobjects.Status;

public record UpdateTaskResource(String title, String description, Status status, Integer estimation) {
}
