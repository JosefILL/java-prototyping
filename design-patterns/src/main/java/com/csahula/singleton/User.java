package com.csahula.singleton;

/**
 * User data wrapper.
 */
public class User {

    /**
     * Name of logged user.
     * @HasGetter
     * @HasSetter
     */
    String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
