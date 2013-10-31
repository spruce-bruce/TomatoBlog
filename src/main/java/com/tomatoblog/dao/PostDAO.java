package com.tomatoblog.dao;

import com.tomatoblog.domain.Post;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 10/30/13
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PostDAO {
    public Post getPost();
    public void getPosts();
    public void getPosts(int limit);
    public void getPosts(int limit, int offset);

    public void save(Post post);
}
