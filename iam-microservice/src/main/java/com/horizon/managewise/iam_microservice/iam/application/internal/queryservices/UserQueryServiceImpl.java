package com.horizon.managewise.iam_microservice.iam.application.internal.queryservices;

import org.springframework.stereotype.Service;
import com.horizon.managewise.iam_microservice.iam.domain.model.aggregates.User;
import com.horizon.managewise.iam_microservice.iam.domain.model.queries.GetAllUsersQuery;
import com.horizon.managewise.iam_microservice.iam.domain.model.queries.GetUserByIdQuery;
import com.horizon.managewise.iam_microservice.iam.domain.model.queries.GetUserByUsernameQuery;
import com.horizon.managewise.iam_microservice.iam.domain.services.UserQueryService;
import com.horizon.managewise.iam_microservice.iam.infrastructure.persistence.jpa.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

/**
 * Implementation of {@link UserQueryService} interface.
 */
@Service
public class UserQueryServiceImpl implements UserQueryService {
  private final UserRepository userRepository;

  /**
   * Constructor.
   *
   * @param userRepository {@link UserRepository} instance.
   */
  public UserQueryServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  /**
   * This method is used to handle {@link GetAllUsersQuery} query.
   * @param query {@link GetAllUsersQuery} instance.
   * @return {@link List} of {@link User} instances.
   * @see GetAllUsersQuery
   */
  @Override
  public List<User> handle(GetAllUsersQuery query) {
    return userRepository.findAll();
  }

  /**
   * This method is used to handle {@link GetUserByIdQuery} query.
   * @param query {@link GetUserByIdQuery} instance.
   * @return {@link Optional} of {@link User} instance.
   * @see GetUserByIdQuery
   */
  @Override
  public Optional<User> handle(GetUserByIdQuery query) {
    return userRepository.findById(query.userId());
  }

  /**
   * This method is used to handle {@link GetUserByUsernameQuery} query.
   * @param query {@link GetUserByUsernameQuery} instance.
   * @return {@link Optional} of {@link User} instance.
   * @see GetUserByUsernameQuery
   */
  @Override
  public Optional<User> handle(GetUserByUsernameQuery query) {
    return userRepository.findByUsername(query.username());
  }
}
