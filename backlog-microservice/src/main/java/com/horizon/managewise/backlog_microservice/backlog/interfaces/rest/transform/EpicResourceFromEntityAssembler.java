package com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Epic;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.EpicResource;

public class EpicResourceFromEntityAssembler {
    public static EpicResource toResourceFromEntity(Epic entity){
        return new EpicResource(entity.getId(), entity.getTitle(), entity.getDescription());
    }
}
