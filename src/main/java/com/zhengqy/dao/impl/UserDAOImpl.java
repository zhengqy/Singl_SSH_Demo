package com.zhengqy.dao.impl;

import com.zhengqy.dao.UserDAO;
import com.zhengqy.model.Guser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by zheng on 2016/12/21.
 */
public class UserDAOImpl implements UserDAO {
    private SessionFactory sessionFactory;

    public boolean add(Guser guser) {
        Session session = sessionFactory.getCurrentSession();
        session.save(guser);
        return true;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
