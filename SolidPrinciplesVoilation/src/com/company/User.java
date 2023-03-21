package com.company;
import com.company.model.UserData;
import com.company.model.UserOps;

import java.util.ArrayList;

    /* Violation SRP(Single Responsibility Principle) */
    public class User implements UserOps {

        ArrayList<UserData> list=new ArrayList<>();
        @Override
        public boolean login(UserData data) {
            // Login details fetching from the database checking they are valid or not
            if(data.getUser_name().equals("ramakanth222") && data.getPassword().equals("1234")){
                return true;
            }else {
                return false;
            }
        }

        @Override
        public boolean register(UserData data) {
            // if (email is valid) then storing into DB
            list.add(data);
            return true;
        }

        @Override
        public boolean sendEmail(UserData data, String details) {
            // send mail to data.getEmail()
            return true;
        }
    }