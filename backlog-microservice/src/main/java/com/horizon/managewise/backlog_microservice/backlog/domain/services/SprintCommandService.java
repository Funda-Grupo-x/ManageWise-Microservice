package com.horizon.managewise.backlog_microservice.backlog.domain.services;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Sprint;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.CreateSprintCommand;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.DeleteSprintCommand;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.UpdateSprintCommand;

import java.util.Optional;

public interface SprintCommandService {
    Long handle(CreateSprintCommand command);
    Optional<Sprint> handle(UpdateSprintCommand command);
    void handle(DeleteSprintCommand command);
}
