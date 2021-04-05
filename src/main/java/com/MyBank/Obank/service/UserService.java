package com.MyBank.Obank.service;

import com.MyBank.Obank.model.User;

public interface UserService {
    int createAccount(User user);
    int depositAmount(int amount);
    int withdrawAmount(int with);
    User checkBal(int id);
}
