package com.horizon.managewise.backlog_microservice.backlog.domain.model.commands;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.valueobjects.SprintStatus;

public record UpdateSprintCommand(Long id, String title, String goal, SprintStatus status) {
}
