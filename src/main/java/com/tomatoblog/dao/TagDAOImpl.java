package com.tomatoblog.dao;

import com.tomatoblog.domain.Tag;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 11/4/13
 * Time: 10:47 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class TagDAOImpl {

    @Autowired
    SessionFactory sessionFactory;

    public Tag getTag(int id){
        return new Tag();
    }
    public void getTags(){

    }
}
