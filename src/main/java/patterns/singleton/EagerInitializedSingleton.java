package patterns.singleton;


/**
 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
 * this is the easiest method to create a patterns.singleton class
 * but it has a drawback that instance is created even though client application might not be using it.
 * If your patterns.singleton class is not using a lot of resources, this is the approach to use.
 */

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }
}
