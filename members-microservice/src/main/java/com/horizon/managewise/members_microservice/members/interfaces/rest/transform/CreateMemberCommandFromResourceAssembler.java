package com.horizon.managewise.members_microservice.members.interfaces.rest.transform;

import com.horizon.managewise.members_microservice.members.domain.model.commands.CreateMemberCommand;
import com.horizon.managewise.members_microservice.members.interfaces.rest.resources.CreateMemberResource;

public class CreateMemberCommandFromResourceAssembler {
    public static CreateMemberCommand toCommandFromResource(CreateMemberResource resource) {
        return new CreateMemberCommand(
                resource.fullName(),
                resource.email(),
                resource.streetAddress(),
                resource.role()
        );
    }
}
