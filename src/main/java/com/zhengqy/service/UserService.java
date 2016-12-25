package com.zhengqy.service;

import com.zhengqy.dao.UserDAO;
import com.zhengqy.model.Guser;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zheng on 2016/12/20.
 */
public class UserService {
    private UserDAO userDAO;

    @Transactional
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
