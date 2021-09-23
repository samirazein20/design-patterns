package patterns.singleton;

/**The above implementation works fine in case of the single-threaded environment but
when it comes to multithreaded systems, it can cause issues
 if multiple threads are inside the if condition at the same time.
 **/
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton(){}

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}


