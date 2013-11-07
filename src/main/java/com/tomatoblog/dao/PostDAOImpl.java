package com.tomatoblog.dao;

import com.tomatoblog.domain.Post;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 10/30/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class PostDAOImpl implements PostDAO{

    @Autowired
    SessionFactory sessionFactory;

    public Post getPost(String slug){
        return new Post();
    }

    public List getPosts(){
        Session session = sessionFactory.openSession();
        List posts = session.createQuery("from Post").list();
        session.close();
        return posts;
    }

    public List getPosts(int limit){
        return new ArrayList();
    }

    public List getPosts(int limit, int offset){
        return new ArrayList();
    }

    public void save(Post post){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(post);
        session.getTransaction().commit();
        session.close();
    }
}
