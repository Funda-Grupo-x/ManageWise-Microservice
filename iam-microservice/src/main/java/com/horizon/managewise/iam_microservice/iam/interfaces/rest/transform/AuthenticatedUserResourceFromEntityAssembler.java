package com.horizon.managewise.iam_microservice.iam.interfaces.rest.transform;

import com.horizon.managewise.iam_microservice.iam.domain.model.aggregates.User;
import com.horizon.managewise.iam_microservice.iam.interfaces.rest.resources.AuthenticatedUserResource;

public class AuthenticatedUserResourceFromEntityAssembler {

  public static AuthenticatedUserResource toResourceFromEntity(User user, String token) {
    return new AuthenticatedUserResource(user.getId(), user.getUsername(), token);
  }
}
