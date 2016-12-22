package com.zhengqy.service;

import com.zhengqy.dao.UserDAO;
import com.zhengqy.model.Guser;

/**
 * Created by zheng on 2016/12/20.
 */
public class UserService {
    private UserDAO userDAO;

    public boolean add(Guser guser){
        return userDAO.add(guser);
    }


    public UserDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
