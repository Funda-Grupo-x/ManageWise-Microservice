package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.CreateUserStoryCommand;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.CreateUserStoryResource;

import java.util.Collections;

public class CreateUserStoryCommandFromResourceAssembler {
    public static CreateUserStoryCommand toCommandFromResource(CreateUserStoryResource resource){
        return new CreateUserStoryCommand(
                resource.title(),
                resource.description(),
                resource.epicId(),
                resource.sprintId(),
                resource.effort(),
                Collections.emptyList());
    }
}
