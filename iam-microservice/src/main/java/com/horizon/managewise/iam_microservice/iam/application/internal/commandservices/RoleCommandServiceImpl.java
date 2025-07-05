package com.horizon.managewise.iam_microservice.iam.application.internal.commandservices;

import org.springframework.stereotype.Service;
import com.horizon.managewise.iam_microservice.iam.domain.model.commands.SeedRolesCommand;
import com.horizon.managewise.iam_microservice.iam.domain.model.entities.Role;
import com.horizon.managewise.iam_microservice.iam.domain.model.valueobjects.Roles;
import com.horizon.managewise.iam_microservice.iam.domain.services.RoleCommandService;
import com.horizon.managewise.iam_microservice.iam.infrastructure.persistence.jpa.repositories.RoleRepository;

import java.util.Arrays;

/**
 * Implementation of {@link RoleCommandService} to handle {@link SeedRolesCommand}
 */
@Service
public class RoleCommandServiceImpl implements RoleCommandService {

  private final RoleRepository roleRepository;

  public RoleCommandServiceImpl(RoleRepository roleRepository) {
    this.roleRepository = roleRepository;
  }

  /**
   * This method will handle the {@link SeedRolesCommand} and will create the roles if not exists
   * @param command {@link SeedRolesCommand}
   * @see SeedRolesCommand
   */
  @Override
  public void handle(SeedRolesCommand command) {
    Arrays.stream(Roles.values())
        .forEach(role -> {
          if(!roleRepository.existsByName(role)) {
            roleRepository.save(new Role(Roles.valueOf(role.name())));
          }
        } );
  }
}
