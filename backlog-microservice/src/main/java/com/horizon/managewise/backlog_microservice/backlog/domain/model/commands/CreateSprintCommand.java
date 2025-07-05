package com.horizon.managewise.backlog_microservice.backlog.domain.model.commands;

import java.util.Date;

public record CreateSprintCommand(String title, String goal, Date endDate) {
}
