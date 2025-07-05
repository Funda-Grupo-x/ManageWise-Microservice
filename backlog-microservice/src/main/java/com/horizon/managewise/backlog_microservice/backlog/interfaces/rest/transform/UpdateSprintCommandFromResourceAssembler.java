package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.UpdateSprintCommand;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.SprintResource;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.UpdateSprintResource;

public class UpdateSprintCommandFromResourceAssembler {
    public static UpdateSprintCommand toCommandFromResource(Long id, UpdateSprintResource resource){
        return new UpdateSprintCommand(id, resource.title(), resource.goal(), resource.status());
    }
}
