package com.bits.dbms.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Long userId;
    private String userName;
    private String email;
    private Long phone;
    private String password;
    private Long roleId;
}
