package com.horizon.managewise.iam_microservice.iam.domain.services;

import com.horizon.managewise.iam_microservice.iam.domain.model.commands.SeedRolesCommand;

public interface RoleCommandService {
  void handle(SeedRolesCommand command);
}
