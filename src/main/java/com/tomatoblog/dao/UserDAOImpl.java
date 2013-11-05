package com.tomatoblog.dao;

import com.tomatoblog.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 11/4/13
 * Time: 10:37 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class UserDAOImpl {
    @Autowired
    SessionFactory sessionFactory;

    public User getUser(int id){
        return new User();
    }
    public void getUsers(){

    }
    public void save(User user){

    }
}
