package com.bits.dbms.util;

import com.bits.dbms.config.CryptConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserAuth {

    @Autowired
    private CryptConfig cryptConfig;

    public String hashUserPassword(String userPassword) {
        return this.cryptConfig.passwordEncoder().encode(userPassword);
    }

    public Boolean checkUserPassword(String hashedPasswordFromDatabase, String userEnteredPassword) {
        return this.cryptConfig.passwordEncoder().matches(userEnteredPassword, hashedPasswordFromDatabase);
    }
}
