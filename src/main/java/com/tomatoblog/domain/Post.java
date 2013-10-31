package com.tomatoblog.domain;

/**
 * Created with IntelliJ IDEA.
 * User: aaron
 * Date: 10/30/13
 * Time: 10:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class Post {
    private String slug;
    private String body;
    private int created;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getCreated() {
        return created;
    }

    public void setCreated(int created) {
        this.created = created;
    }
}
