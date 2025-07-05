package com.horizon.managewise.iam_microservice.iam.domain.model.queries;

import com.horizon.managewise.iam_microservice.iam.domain.model.valueobjects.Roles;

public record GetRoleByNameQuery(Roles name) {
}
