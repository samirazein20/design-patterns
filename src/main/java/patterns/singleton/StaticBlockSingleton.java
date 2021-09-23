package patterns.singleton;

/**
Static block initialization implementation is similar to eager initialization,
except that instance of class is created in the static block that provides option for exception handling.
**/

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating patterns.singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
