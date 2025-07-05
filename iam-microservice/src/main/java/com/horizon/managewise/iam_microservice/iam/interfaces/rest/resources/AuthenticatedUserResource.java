package com.horizon.managewise.iam_microservice.iam.interfaces.rest.resources;

public record AuthenticatedUserResource(Long id, String username, String token) {
}
