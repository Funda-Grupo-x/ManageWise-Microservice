package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.UpdateTaskItemCommand;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.valueobjects.Status;

public class UpdateTaskItemCommandFromResourceAssembler {
    public static UpdateTaskItemCommand toCommandFromResource(Long taskId, Long userStoryId, String title, String description, Status status, Integer estimation){
        return new UpdateTaskItemCommand(taskId, userStoryId, title, description, status, estimation);
    }
}
