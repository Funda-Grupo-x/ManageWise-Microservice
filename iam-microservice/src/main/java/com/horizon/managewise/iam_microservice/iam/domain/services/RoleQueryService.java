package com.horizon.managewise.iam_microservice.iam.domain.services;

import com.horizon.managewise.iam_microservice.iam.domain.model.entities.Role;
import com.horizon.managewise.iam_microservice.iam.domain.model.queries.GetAllRolesQuery;
import com.horizon.managewise.iam_microservice.iam.domain.model.queries.GetRoleByNameQuery;

import java.util.List;
import java.util.Optional;

public interface RoleQueryService {
  List<Role> handle(GetAllRolesQuery query);
  Optional<Role> handle(GetRoleByNameQuery query);
}
