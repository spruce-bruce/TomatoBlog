package com.tomatoblog.dao;

import com.tomatoblog.domain.Part;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 11/4/13
 * Time: 10:42 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PartDAO {
    public Part getPart(int id);
    public void getParts();
}
