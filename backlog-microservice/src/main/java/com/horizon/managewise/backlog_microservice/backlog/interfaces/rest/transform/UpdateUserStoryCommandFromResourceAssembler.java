package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.UpdateUserStoryCommand;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.UpdateUserStoryResource;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.UserStoryResource;

public class UpdateUserStoryCommandFromResourceAssembler {
    //public static UpdateUserStoryCommand toCommandFromResource(Long id, UserStoryResource resource){
    public static UpdateUserStoryCommand toCommandFromResource(Long id, UpdateUserStoryResource resource){
        return new UpdateUserStoryCommand(id, resource.title(), resource.description(),
                resource.epicId(), resource.sprintId(), resource.status(),resource.effort());
    }
}
