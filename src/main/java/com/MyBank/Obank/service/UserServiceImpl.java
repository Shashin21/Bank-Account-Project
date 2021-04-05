package com.MyBank.Obank.service;

import com.MyBank.Obank.dao.UserDao;
import com.MyBank.Obank.model.User;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDao() {


        @Override
        public int createAccount(User user) {
            return 0;
        }

        @Override
        public int depositAmount(int amount) {
            return 0;
        }

        @Override
        public int withdrawAmount(int amount) {
            return 0;
        }

        @Override
        public int checkBalance(int id) {
            return 0;
        }
    };

    @Override
    public int createAccount(User user) {
        return 0;
    }

    @Override
    public int depositAmount(int amount) {
        return 0;
    }

    @Override
    public int withdrawAmount(int with) {
        return 0;
    }

    @Override
    public User checkBal(int id) {
        return null;
    }
}


