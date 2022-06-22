package net.chunchieh.springbootmall.service;

import net.chunchieh.springbootmall.dto.UserRegisterRequest;
import net.chunchieh.springbootmall.model.User;

public interface UserService {
    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}
