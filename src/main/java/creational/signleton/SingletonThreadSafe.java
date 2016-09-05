package creational.signleton;

/**
 * Created by Roma on 04.09.2016.
 * Thread-safe version of Singleton
 */
public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    public static SingletonThreadSafe getInstance(){
        SingletonThreadSafe local = instance;
        if (local == null){
            synchronized (SingletonThreadSafe.class){
                local = instance;
                if (local == null){
                    instance = new SingletonThreadSafe();
                }
            }
        }

        return instance;
    }
}
