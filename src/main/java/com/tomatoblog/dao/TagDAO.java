package com.tomatoblog.dao;

import com.tomatoblog.domain.Tag;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 11/4/13
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
public interface TagDAO {
    public Tag getTag(int id);
    public void getTags();
}
