package com.horizon.managewise.members_microservice.members.domain.model.commands;

import com.horizon.managewise.members_microservice.members.domain.model.valueobjects.ScrumRoles;

public record CreateMemberCommand(
        String fullName,
        String email,
        String streetAddress,
        ScrumRoles role
) {}
