package com.bits.dbms.service;

import com.bits.dbms.dto.UserDTO;

public interface UserService {
    Long signUp(UserDTO userDTO) throws Exception;

    UserDTO signIn(UserDTO userDTO) throws Exception;
}
