package com.horizon.managewise.backlog_microservice.backlog.domain.services;

import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Sprint;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetAllSprintsQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetSprintByIdQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetSprintByTittleQuery;

import java.util.List;
import java.util.Optional;

public interface SprintQueryService {
    Optional<Sprint> handle(GetSprintByIdQuery query);
    List<Sprint> handle(GetAllSprintsQuery query);;
    Optional<Sprint> handle(GetSprintByTittleQuery query);
}
