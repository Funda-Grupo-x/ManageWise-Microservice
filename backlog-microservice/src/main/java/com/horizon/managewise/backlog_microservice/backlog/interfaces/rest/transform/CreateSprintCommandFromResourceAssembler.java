package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.CreateSprintCommand;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.CreateSprintResource;

public class CreateSprintCommandFromResourceAssembler {
    public static CreateSprintCommand toCommandFromResource(CreateSprintResource resource){
        return new CreateSprintCommand(resource.title(), resource.goal(), resource.endDate());
    }
}
