package com.horizon.managewise.members_microservice.members.domain.services;

import com.horizon.managewise.members_microservice.members.domain.model.aggregates.Member;
import com.horizon.managewise.members_microservice.members.domain.model.queries.GetAllMembersQuery;
import com.horizon.managewise.members_microservice.members.domain.model.queries.GetMemberByFullNameQuery;
import com.horizon.managewise.members_microservice.members.domain.model.queries.GetMemberByIdQuery;
import com.horizon.managewise.members_microservice.members.domain.model.queries.GetMembersByRoleQuery;

import java.util.List;
import java.util.Optional;

public interface MemberQueryService {
    List<Member> handle(GetAllMembersQuery query);
    Optional<Member> handle(GetMemberByIdQuery query);
    Optional<Member> handle(GetMembersByRoleQuery query);
    Optional<Member> handle(GetMemberByFullNameQuery query);
}