package com.horizon.managewise.backlog_microservice.backlog.application.internal.queryservices;

import org.springframework.stereotype.Service;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Epic;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetAllEpicsQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetEpicByIdQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.services.EpicQueryService;
import com.horizon.managewise.backlog_microservice.backlog.infrastructure.persistence.jpa.repositories.EpicRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EpicQueryServiceImpl implements EpicQueryService {
    private final EpicRepository epicRepository;

    public EpicQueryServiceImpl(EpicRepository epicRepository) {
        this.epicRepository = epicRepository;
    }

    @Override
    public List<Epic> handle(GetAllEpicsQuery query){
        return this.epicRepository.findAll();
    }

    @Override
    public Optional<Epic> handle(GetEpicByIdQuery query){
        return this.epicRepository.findById(query.epicId());
    }
}
