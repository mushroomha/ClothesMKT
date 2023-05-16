package com.vince.service.impl;

import com.vince.bean.User;
import com.vince.service.UserService;
import com.vince.utils.BusinessException;
import com.vince.utils.UserIO;

import java.io.IOException;

public class UserServiceImpl implements UserService {
    @Override
    public User register(User user) throws BusinessException {
        UserIO userIO = new UserIO();
        userIO.add(user);
        userIO.writeUsers();
        return user;
    }

}
