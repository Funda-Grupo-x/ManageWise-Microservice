package com.horizon.managewise.iam_microservice.iam.domain.model.commands;

import com.horizon.managewise.iam_microservice.iam.domain.model.entities.Role;

import java.util.List;

public record SignUpCommand(String username, String password, List<Role> roles) {
}
