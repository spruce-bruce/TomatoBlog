package com.tomatoblog.dao;

import com.tomatoblog.domain.User;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 10/30/13
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface UserDAO {
    public User getUser(int id);
    public void getUsers();
    public void save(User user);
}
