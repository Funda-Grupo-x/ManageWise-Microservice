package com.horizon.managewise.backlog_microservice.backlog.domain.services;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Epic;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.CreateEpicCommand;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.DeleteEpicCommand;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.UpdateEpicCommand;

import java.util.Optional;

public interface EpicCommandService {
    Long handle(CreateEpicCommand command);
    Optional<Epic> handle(UpdateEpicCommand command);
    void handle(DeleteEpicCommand command);
}
