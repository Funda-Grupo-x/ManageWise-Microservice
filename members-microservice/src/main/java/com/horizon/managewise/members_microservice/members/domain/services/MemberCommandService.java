package com.horizon.managewise.members_microservice.members.domain.services;

import com.horizon.managewise.members_microservice.members.domain.model.aggregates.Member;
import com.horizon.managewise.members_microservice.members.domain.model.commands.CreateMemberCommand;
import com.horizon.managewise.members_microservice.members.domain.model.commands.DeleteMemberCommand;
import com.horizon.managewise.members_microservice.members.domain.model.commands.UpdateMemberCommand;

import java.util.Optional;

public interface MemberCommandService {
    Long handle(CreateMemberCommand command);
    Optional<Member> handle(UpdateMemberCommand command);
    void handle(DeleteMemberCommand command);
}
