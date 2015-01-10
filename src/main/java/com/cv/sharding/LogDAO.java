package com.cv.sharding;

public interface LogDAO{

    UserLog save(UserLog entity); 

    UserLog findOne(long primaryKey);       

    Iterable<UserLog> findAll();          

    Long count();                   

    void delete(long primaryKey);          

    boolean exists(long primaryKey); 
}
