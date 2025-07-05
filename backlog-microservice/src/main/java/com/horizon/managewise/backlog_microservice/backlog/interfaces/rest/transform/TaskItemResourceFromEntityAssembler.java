package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.entities.TaskItem;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.TaskItemResource;

public class TaskItemResourceFromEntityAssembler {
    public static TaskItemResource toResourceFromEntity(TaskItem taskItem){
        return new TaskItemResource(
                taskItem.getId(),
                taskItem.getTitle(),
                taskItem.getDescription(),
                taskItem.getStatus(),
                taskItem.getEstimation());
    }
}
