package com.zhengqy.dao.impl;

import com.zhengqy.dao.UserDAO;
import com.zhengqy.model.Guser;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * Created by zheng on 2016/12/21.
 */
public class UserDAOImpl implements UserDAO {
    private SessionFactory sessionFactory;

    public boolean add(Guser guser) {
        Session session = null;
        Transaction transaction = null;
        try {
            //<editor-fold desc="Description">
            session = sessionFactory.getCurrentSession();
            transaction = session.beginTransaction();
            session.save(guser);
            transaction.commit();
            //</editor-fold>
            return true;
        }catch (Exception e){
            e.printStackTrace();
            if(transaction!=null){
                transaction.rollback();
            }
            return false;
        }finally {
            session.close();
        }
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


}
