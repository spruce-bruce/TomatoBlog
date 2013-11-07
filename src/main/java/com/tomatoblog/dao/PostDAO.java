package com.tomatoblog.dao;

import com.tomatoblog.domain.Post;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 10/30/13
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PostDAO {
    public Post getPost(String slug);
    public List getPosts();
    public List getPosts(int limit);
    public List getPosts(int limit, int offset);

    public void save(Post post);
}
