package com.MyBank.Obank.dao;

import com.MyBank.Obank.model.User;
import com.MyBank.Obank.util.DbUtil;
import com.MyBank.Obank.util.QueryUtil;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao{
    @Override
    public int createAccount(User user) {
        int create = 0;
        try(
                PreparedStatement ps = DbUtil.getConnection().prepareStatement(QueryUtil.CREATE_SQL);
                ) {
            ps.setString(1, user.getUsername());
            ps.setLong(2, user.getAccount_no());
            ps.setString(3,user.getEmail());
            ps.setLong(4,user.getMobile_no());
            create = ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return create;
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
}
