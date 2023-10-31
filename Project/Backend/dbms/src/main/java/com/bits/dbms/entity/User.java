package com.bits.dbms.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private Long phone;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLE_ID")
    private Long roleId;

}
