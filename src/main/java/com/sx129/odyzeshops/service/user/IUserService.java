package com.sx129.odyzeshops.service.user;

import com.sx129.odyzeshops.model.User;
import com.sx129.odyzeshops.request.CreateUserRequest;
import com.sx129.odyzeshops.request.UpdateUserRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UpdateUserRequest request, Long userId);
    void deleteUser(Long userId);
}
