package com.sx129.odyzeshops.controller;

import com.sx129.odyzeshops.exceptions.AlreadyExistsException;
import com.sx129.odyzeshops.exceptions.ResourceNotFoundException;
import com.sx129.odyzeshops.model.User;
import com.sx129.odyzeshops.request.CreateUserRequest;
import com.sx129.odyzeshops.request.UpdateUserRequest;
import com.sx129.odyzeshops.response.ApiResponse;
import com.sx129.odyzeshops.service.user.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("${api.prefix}/users")
public class UserController {
    private final IUserService userService;

    @GetMapping("/{id}/user")
    public ResponseEntity<ApiResponse> getUserById(@PathVariable Long id){
        try {
            User user = userService.getUserById(id);
            return ResponseEntity.ok(new ApiResponse("User fetched successfully", user));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @PostMapping("/add")
    public ResponseEntity<ApiResponse> createUser(@RequestBody CreateUserRequest request){
        try {
            User user = userService.createUser(request);
            return ResponseEntity.ok(new ApiResponse("User created successfully", user));
        } catch (AlreadyExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<ApiResponse> updateUser(@PathVariable Long id, @RequestBody UpdateUserRequest request){
        try {
            User user = userService.updateUser(request, id);
            return ResponseEntity.ok(new ApiResponse("User updated successfully", user));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<ApiResponse> deleteUser(@PathVariable Long id){
        try {
            userService.deleteUser(id);
            return ResponseEntity.ok(new ApiResponse("User deleted successfully", null));
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse(e.getMessage(), null));
        }
    }
}
