package com.horizon.managewise.backlog_microservice.backlog.interfaces.acl;

import org.springframework.stereotype.Service;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.aggregates.Sprint;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.commands.CreateSprintCommand;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetSprintByIdQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.model.queries.GetSprintByTittleQuery;
import com.horizon.managewise.backlog_microservice.backlog.domain.services.SprintCommandService;
import com.horizon.managewise.backlog_microservice.backlog.domain.services.SprintQueryService;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.resources.SprintResource;
import com.horizon.managewise.backlog_microservice.backlog.interfaces.rest.transform.SprintResourceFromEntityAssembler;

import java.util.Optional;

@Service
public class SprintsContextFacade {

    //DI
    private final SprintCommandService sprintCommandService;
    private final SprintQueryService sprintQueryService;

    public SprintsContextFacade(SprintCommandService sprintCommandService, SprintQueryService sprintQueryService) {
        this.sprintCommandService = sprintCommandService;
        this.sprintQueryService = sprintQueryService;
    }

    public Optional<SprintResource> fetchSprintById(Long sprintId){
        var getSPrintByIdQuery = new GetSprintByIdQuery(sprintId);
        var optionalSprint = sprintQueryService.handle(getSPrintByIdQuery);
        if(optionalSprint.isEmpty()){
            return Optional.empty();
        }
        var sprintResource = SprintResourceFromEntityAssembler.toResourceFromEntity(optionalSprint.get());
        return Optional.of(sprintResource);
    }

    public Long fetchSprintIdByTittle(String tittle){
        //1. Create Query and call handle
        var getSprintByTittleQuery = new GetSprintByTittleQuery(tittle);
        var optionalSprint = sprintQueryService.handle(getSprintByTittleQuery);
        //2. validation
        //si no lo encuentro retorno 0Long
        if (optionalSprint.isEmpty()) {
            return 0L;
        }
        //3. response
        //en caso si existe retorno el id
        return optionalSprint.get().getId();
    }

    //Devolvere un true o false
    public boolean existsSprintByTittleAndIdIsNot(String tittle, Long id) {
        //1. create query and call handle
        var getSprintByTittleQuery = new GetSprintByTittleQuery(tittle);
        var optionalSprint = sprintQueryService.handle(getSprintByTittleQuery);
        //2. validation and return
        if (optionalSprint.isEmpty()) {
            return false;
        }
        return optionalSprint.get().getId() != id;
    }
}
