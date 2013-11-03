package com.tomatoblog.dao;

import com.tomatoblog.domain.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 11/2/13
 * Time: 8:44 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class JdbcPostDAOImpl implements PostDAO{
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public Post getPost(String slug){
        return new Post();
    }

    public int getPostCount(){
        Integer rowCount = this.jdbcTemplate.queryForObject("select count(*) from posts", Integer.class);
        return rowCount;
    }

    public void getPosts(){

    }

    public void getPosts(int limit){

    }

    public void getPosts(int limit, int offset){

    }

    public void save(Post post){

    }
}
