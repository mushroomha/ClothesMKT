package com.vince.ui;

import com.vince.bean.User;

import java.util.ResourceBundle;
import java.util.Scanner;

public abstract class BaseClass {
    protected static Scanner input = new Scanner(System.in);
    protected static User currUser;   // current User object
    private static ResourceBundle r =
                ResourceBundle.getBundle("com.vince.res.r");
    public static String getString(String key){
        return r.getString(key);
    }

    public static void println(String s){
        System.out.println(s);
    }
}
