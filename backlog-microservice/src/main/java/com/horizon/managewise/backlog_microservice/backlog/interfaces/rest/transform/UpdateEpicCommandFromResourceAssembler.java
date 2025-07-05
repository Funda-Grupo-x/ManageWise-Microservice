package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.UpdateEpicCommand;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.EpicResource;

public class UpdateEpicCommandFromResourceAssembler {
    public static UpdateEpicCommand toCommandFromResource(Long id, EpicResource resource){
        return new UpdateEpicCommand(id, resource.title(), resource.description());
    }
}


