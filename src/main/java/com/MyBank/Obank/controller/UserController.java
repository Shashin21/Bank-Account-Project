package com.MyBank.Obank.controller;

import com.MyBank.Obank.model.User;
import com.MyBank.Obank.service.UserService;
import com.MyBank.Obank.service.UserServiceImpl;

import javax.swing.*;
import java.time.LocalDate;

public class UserController {
    public static void main(String[] args) {
        String decision = "";
        UserService userService = new UserServiceImpl();
        do{
            String op = JOptionPane.showInputDialog("Enter operation: Account | Transanction");
            switch (op.toLowerCase()){
                case "account":
                    User user = getUser("account");
                    int saved = userService.createAccount(user);
                    if (saved >= 1) {
                        JOptionPane.showMessageDialog(null, "user info saved in db");
                    }else{
                        JOptionPane.showMessageDialog(null, "error in the db");
                    }
                    break;
            }
            decision=JOptionPane.showInputDialog("Do you want to continue? y/n");
        }while(decision.equalsIgnoreCase("y"));
    }

    public static User getUser(String type){
        User user = new User();
        if(type.equals("update")){
            int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id: "));
            user.setId(id);
        }
        int opt = Integer.parseInt(JOptionPane.showInputDialog("Do you want to 1. create, 2. deposit, 3. withdraw or 4.checkBal?"));
        switch (opt){
            case 1:
                ask();
                break;
            case 2:
                double dip = Double.parseDouble(JOptionPane.showInputDialog("How much amount do you want to deposit?"));
                break;
                case 3:
                double with = Double.parseDouble(JOptionPane.showInputDialog("How much do you want to withdraw?"));
                break;
                case 4:
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter ID: "));
                //user = UserService.checkBal(id);

        }

        return user;
    }

    public static void ask(){
        User user = new User();
        String username = JOptionPane.showInputDialog("Enter username:");
        long account = Long.parseLong(JOptionPane.showInputDialog("Enter the account number."));
        long mobileNo = Long.parseLong(JOptionPane.showInputDialog("Enter mobile no: "));
        String email = JOptionPane.showInputDialog("Enter the email address.");
        user.setUsername(username);
        user.setMobileNo(mobileNo);
        user.setAccount_no(account);
    }
}
