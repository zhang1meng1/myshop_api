package com.kgc.service;


import com.kgc.pojo.QgUser;

public interface RpcUserService {
    public QgUser findUserLogin(String phone, String password) throws  Exception;
}
