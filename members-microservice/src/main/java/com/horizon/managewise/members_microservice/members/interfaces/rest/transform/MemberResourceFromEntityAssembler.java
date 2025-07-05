package com.horizon.managewise.members_microservice.members.interfaces.rest.transform;

import org.springframework.stereotype.Component;
import com.horizon.managewise.members_microservice.members.domain.model.aggregates.Member;
import com.horizon.managewise.members_microservice.members.interfaces.rest.resources.MemberResource;

@Component
public class MemberResourceFromEntityAssembler {
    public static MemberResource toResourceFromEntity(Member entity) {
        return new MemberResource(
                entity.getId(),
                entity.getFullName(),
                entity.getRole(),
                entity.getEmail(),
                entity.getStreetAddress()
        );
    }
}
