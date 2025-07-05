package com.horizon.managewise.backlog_microservice.backlog.domain.model.commands;

public record UpdateEpicCommand(Long id, String title, String description) {
}
