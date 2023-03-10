package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl  implements UserService{

    List<User> list = List.of(
            new User(1L,"a","1234"),
            new User(2L,"b","2234"),
            new User(3L,"c","3234")

    );
    @Override
    public User getUser(Long id) {
        return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
