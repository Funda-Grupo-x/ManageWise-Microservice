package com.horizon.managewise.backlog_microservice.backlog.domain.services;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Epic;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetAllEpicsQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetEpicByIdQuery;

import java.util.List;
import java.util.Optional;

public interface EpicQueryService {
    List<Epic> handle(GetAllEpicsQuery query);
    Optional<Epic> handle(GetEpicByIdQuery query);
}
