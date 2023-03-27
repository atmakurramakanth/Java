package com.company.model;
/* Violation of IInterface Segregation Principle */
public interface UserOps {
    boolean login(UserData data);
    boolean register(UserData data);
    boolean sendEmail(UserData data,String details);
}
