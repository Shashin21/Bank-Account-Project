package com.MyBank.Obank.dao;

import com.MyBank.Obank.model.User;

public interface UserDao {
    int createAccount(User user);
    int depositAmount(int amount);
    int withdrawAmount (int amount);
    int checkBalance (int id);

}
