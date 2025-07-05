package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources;

import java.util.Date;

public record CreateSprintResource(String title, String goal, Date endDate) {
}
