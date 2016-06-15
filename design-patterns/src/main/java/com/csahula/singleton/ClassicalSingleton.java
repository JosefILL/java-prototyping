package com.csahula.singleton;

/**
 * Singleton: Ensures that we share only one instance of class in whole application.
 * Sample of usage are: Logging, DB connection holder, Logged user holder etc.
 *
 * This implementation fully works in Java envirolment.
 * It ensures lazy initialization, thread safe access.
 * The patter can be destroyed by reflection.
 *
 * @author cyril.sahula@gmail.com (Cyril Sahula)
 * Code is inspired by:
 * http://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-with-examples
 */
public class ClassicalSingleton {

    // Saves only one instance of singleton
    private static ClassicalSingleton INSTANCE;

    // Prevents initialization of class
    private ClassicalSingleton() {}

    /**
     * Logged user.
     * @HasGetter
     * @HasSetter
     */
    User user;

    /**
     * Gets instance of class and ensures that all customers gets
     * same instance even in different thread. Also ensures that
     * the instance is created until somebody asks about it.
     * It saves memory of app server.
     */
    public static ClassicalSingleton getInstance(){
        if(INSTANCE == null){
            // Thread save condition
            synchronized (ClassicalSingleton.class) {
                if(INSTANCE == null){
                    INSTANCE = new ClassicalSingleton();
                }
            }
        }
        return INSTANCE;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
