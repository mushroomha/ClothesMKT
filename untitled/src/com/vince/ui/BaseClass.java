package com.vince.ui;

import java.util.ResourceBundle;
import java.util.Scanner;

public abstract class BaseClass {
    protected static Scanner input = new Scanner(System.in);
    private static ResourceBundle r =
                ResourceBundle.getBundle("com.vince.res.r");
    public static String getString(String key){
        return r.getString(key);
    }
}
