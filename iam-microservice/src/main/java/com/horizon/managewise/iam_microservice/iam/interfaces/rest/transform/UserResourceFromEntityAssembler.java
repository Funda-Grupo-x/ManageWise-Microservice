package com.horizon.managewise.iam_microservice.iam.interfaces.rest.transform;

import com.horizon.managewise.iam_microservice.iam.domain.model.aggregates.User;
import com.horizon.managewise.iam_microservice.iam.domain.model.entities.Role;
import com.horizon.managewise.iam_microservice.iam.interfaces.rest.resources.UserResource;

public class UserResourceFromEntityAssembler {

  public static UserResource toResourceFromEntity(User user) {
    var roles = user.getRoles().stream()
        .map(Role::getStringName)
        .toList();
    return new UserResource(user.getId(), user.getUsername(), roles);
  }
}
