package com.tomatoblog.dao;

import com.tomatoblog.domain.Part;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 11/4/13
 * Time: 10:43 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class PartDAOImpl {
    @Autowired
    SessionFactory sessionFactory;

    public Part getPart(int id){
        return new Part();
    }
    public void getParts(){

    }
}
