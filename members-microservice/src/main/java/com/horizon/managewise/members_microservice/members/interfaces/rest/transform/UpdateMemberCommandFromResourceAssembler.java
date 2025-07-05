package com.horizon.managewise.members_microservice.members.interfaces.rest.transform;

import com.horizon.managewise.members_microservice.members.domain.model.commands.UpdateMemberCommand;
import com.horizon.managewise.members_microservice.members.interfaces.rest.resources.MemberResource;

//Input
public record UpdateMemberCommandFromResourceAssembler() {
    public static UpdateMemberCommand toCommandFromResource(Long memberId, MemberResource resource){
        return new UpdateMemberCommand(memberId,resource.fullName(),resource.email(),resource.streetAddress(),resource.role());
    }
}
