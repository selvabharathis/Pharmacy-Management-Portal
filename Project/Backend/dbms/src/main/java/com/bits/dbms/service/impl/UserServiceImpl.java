package com.bits.dbms.service.impl;

import com.bits.dbms.dto.UserDTO;
import com.bits.dbms.entity.User;
import com.bits.dbms.repository.UserRepository;
import com.bits.dbms.service.UserService;
import com.bits.dbms.util.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service(value="userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAuth userAuth;

    @Override
    public Long signUp(UserDTO userDTO) throws Exception {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(this.userAuth.hashUserPassword(userDTO.getPassword()));
        user.setPhone(userDTO.getPhone());
        user.setRoleId(userDTO.getRoleId());

        User savedUser = this.userRepository.save(user);
        return savedUser.getUserId();
    }

    @Override
    public UserDTO signIn(UserDTO userDTO) throws Exception {
        Optional<User> optional = this.userRepository.findByEmail(userDTO.getEmail());
        User user = optional.orElseThrow(() -> new Exception("Service.USER_NOT_FOUND"));
        Boolean isUserAuthorized = this.userAuth.checkUserPassword(user.getPassword(), userDTO.getPassword());
        if(isUserAuthorized) {
            UserDTO userDTO1 = new UserDTO();
            userDTO1.setRoleId(user.getRoleId());
            userDTO1.setEmail(user.getEmail());
            userDTO1.setUserName(user.getUserName());

            return userDTO1;
        }

        return null;
    }
}
