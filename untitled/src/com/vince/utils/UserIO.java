package com.vince.utils;

import com.vince.bean.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserIO {
    private static List<User> users = new ArrayList<>();
    public static final String USER_FILE = "user.obj";

    public boolean writeUsers()throws BusinessException{
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(USER_FILE));
            out.writeObject(users);
            out.close();
            return true;
        }catch (IOException e){
            throw new BusinessException("io.write.error");
        }
    }

    public boolean readUsers()throws BusinessException{
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(USER_FILE));
            users = (List<User>) in.readObject();
            in.close();
            return true;
        }catch (IOException|ClassNotFoundException e){
            throw new BusinessException("io.read.error");
        }
    }

    public void add(User user){
        user.setId(users.size()+1);
        users.add(user);
    }
}
