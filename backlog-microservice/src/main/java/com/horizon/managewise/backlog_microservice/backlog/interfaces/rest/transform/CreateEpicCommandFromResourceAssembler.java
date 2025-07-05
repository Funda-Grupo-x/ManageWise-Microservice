package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.CreateEpicCommand;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.CreateEpicResource;

public class CreateEpicCommandFromResourceAssembler {
    public static CreateEpicCommand toCommandFromResource(CreateEpicResource resource){
        return new CreateEpicCommand(resource.title(), resource.description());
    }
}
