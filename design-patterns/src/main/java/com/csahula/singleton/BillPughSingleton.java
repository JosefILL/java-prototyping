package com.csahula.singleton;

/**
 * Singleton: Ensures that we share only one instance of class in whole application.
 * Sample of usage are: Logging, DB connection holder, Logged user holder etc.
 *
 * Bill Pugh Singleton design pattern implementation.
 * This implementation fully works in Java envirolment.
 * It ensures lazy initialization, thred safe access.
 * The patter can be destroyed by reflection.
 *
 * Code is inspired by:
 * http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-with-examples
 */
public class BillPughSingleton {

    /**
     * Logged user.
     * @HasGetter
     * @HasSetter
     */
    User user;

    /**
     * Ensures that it is not possible to initialize class directly.
     */
    private BillPughSingleton() {}

    /**
     * Returns instance of this class
     */
    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /**
     * Holds instance of this class and share it for all usages.
     */
    private static class SingletonHelper {
        public static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
