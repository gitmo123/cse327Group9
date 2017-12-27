package com.company;
import java.util.HashMap;
//login screen to login to the system
//user types into the login screen
//system checks hashmap to see status and validate
//if the validation is a success then the appropriate dialog box opens

public class login {
    protected String username_user;
    protected char[] password_user;
    boolean is_admin;
    HashMap<String, login> HashMapForUserDetails = new HashMap<String, login>();

    //user enters username and password.
    protected login(String username_user, char[] password_user, boolean is_admin){
        this.username_user = username_user;
        this.password_user = password_user;
        this.is_admin = is_admin;
    }

    protected void addLoginToHashmap(login L){
        HashMapForUserDetails.put(L.username_user, L);
    }

    protected void logInToSystem(String username_user, char[] password_user){
        //search hashmap for user object
        //if object.password matches check if admin
        //if admin open admin panel
        //if student open student panel
        login temp_user;
        temp_user = HashMapForUserDetails.get(username_user);
        if (temp_user.password_user == password_user){
            if (temp_user.is_admin == true){
                adminLogin();
            }
            else if (temp_user.is_admin == false){
                studentLogin();
            }
        }
        else loginValidationException();
    }

}
