package com.horizon.managewise.iam_microservice.iam.domain.services;

import org.apache.commons.lang3.tuple.ImmutablePair;
import com.horizon.managewise.iam_microservice.iam.domain.model.aggregates.User;
import com.horizon.managewise.iam_microservice.iam.domain.model.commands.SignInCommand;
import com.horizon.managewise.iam_microservice.iam.domain.model.commands.SignUpCommand;

import java.util.Optional;

public interface UserCommandService {
  Optional<ImmutablePair<User, String>> handle(SignInCommand command);
  Optional<User> handle(SignUpCommand command);
}
