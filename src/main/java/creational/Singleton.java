package creational;

/**
 * Created by Roma on 04.09.2016.
 * The simplest version of Singleton pattern
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance(){
        return instance;
    }

}
