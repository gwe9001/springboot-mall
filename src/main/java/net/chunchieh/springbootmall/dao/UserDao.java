package net.chunchieh.springbootmall.dao;

import net.chunchieh.springbootmall.dto.UserRegisterRequest;
import net.chunchieh.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);

}
