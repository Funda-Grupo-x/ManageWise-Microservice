package com.horizon.managewise.members_microservice.members.domain.model.queries;


import com.horizon.managewise.members_microservice.members.domain.model.valueobjects.ScrumRoles;

public record GetMembersByRoleQuery(ScrumRoles role) {}