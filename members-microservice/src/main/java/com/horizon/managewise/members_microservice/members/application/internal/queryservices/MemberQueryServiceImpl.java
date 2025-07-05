package com.horizon.managewise.members_microservice.members.application.internal.queryservices;

import org.springframework.stereotype.Service;
import com.horizon.managewise.members_microservice.members.domain.model.aggregates.Member;
import com.horizon.managewise.members_microservice.members.domain.model.queries.GetAllMembersQuery;
import com.horizon.managewise.members_microservice.members.domain.model.queries.GetMemberByFullNameQuery;
import com.horizon.managewise.members_microservice.members.domain.model.queries.GetMemberByIdQuery;
import com.horizon.managewise.members_microservice.members.domain.model.queries.GetMembersByRoleQuery;
import com.horizon.managewise.members_microservice.members.domain.services.MemberQueryService;
import com.horizon.managewise.members_microservice.members.infrastructure.persistence.jpa.repositories.MemberRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MemberQueryServiceImpl implements MemberQueryService {

    private final MemberRepository memberRepository;

    public MemberQueryServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public List<Member> handle(GetAllMembersQuery query) {
        return this.memberRepository.findAll();
    }

    @Override
    public Optional<Member> handle(GetMemberByIdQuery query) {
        return this.memberRepository.findById(query.memberId());
    }

    @Override
    public Optional<Member> handle(GetMembersByRoleQuery query) {
        return this.memberRepository.findByRole(query.role());
    }

    @Override
    public Optional<Member> handle(GetMemberByFullNameQuery query) {
        return this.memberRepository.findByFullName(query.fullName());
    }
}