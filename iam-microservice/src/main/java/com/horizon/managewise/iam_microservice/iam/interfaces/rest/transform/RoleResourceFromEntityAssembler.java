package com.horizon.managewise.iam_microservice.iam.interfaces.rest.transform;

import com.horizon.managewise.iam_microservice.iam.domain.model.entities.Role;
import com.horizon.managewise.iam_microservice.iam.interfaces.rest.resources.RoleResource;

public class RoleResourceFromEntityAssembler {

  public static RoleResource toResourceFromEntity(Role role) {
    return new RoleResource(role.getId(), role.getStringName());
  }
}
