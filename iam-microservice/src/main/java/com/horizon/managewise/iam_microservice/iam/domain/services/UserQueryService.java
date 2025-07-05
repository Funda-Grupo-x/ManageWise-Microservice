package com.horizon.managewise.iam_microservice.iam.domain.services;

import com.horizon.managewise.iam_microservice.iam.domain.model.aggregates.User;
import com.horizon.managewise.iam_microservice.iam.domain.model.queries.GetAllUsersQuery;
import com.horizon.managewise.iam_microservice.iam.domain.model.queries.GetUserByIdQuery;
import com.horizon.managewise.iam_microservice.iam.domain.model.queries.GetUserByUsernameQuery;

import java.util.List;
import java.util.Optional;

public interface UserQueryService {
  List<User> handle(GetAllUsersQuery query);
  Optional<User> handle(GetUserByIdQuery query);
  Optional<User> handle(GetUserByUsernameQuery query);
}
