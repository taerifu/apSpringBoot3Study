package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.domain.User;

@AllArgsConstructor
@Getter
public class AddUserRequest {

    private String email;
    private String password;

}
