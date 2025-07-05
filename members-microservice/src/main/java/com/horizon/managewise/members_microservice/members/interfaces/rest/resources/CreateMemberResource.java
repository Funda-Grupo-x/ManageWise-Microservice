package com.horizon.managewise.members_microservice.members.interfaces.rest.resources;

import com.horizon.managewise.members_microservice.members.domain.model.valueobjects.ScrumRoles;


public record CreateMemberResource(
        String fullName,
        ScrumRoles role,
        String email,
        String streetAddress
) {}
