package com.dictionaryapp.service;

import com.dictionaryapp.model.binding.UserLoginBindingModel;
import com.dictionaryapp.model.binding.UserRegisterBindingModel;

public interface UserService {
    boolean login(UserLoginBindingModel userLoginBindingModel);

    boolean register(UserRegisterBindingModel userRegisterBindingModel);

    void logout();
}
