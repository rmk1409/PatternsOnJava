package creational.factoryMethod;

/**
 * Created by Roma on 09.09.2016.
 * Popular patter "Factory Method" that uses "FactoryMethod(GET(Type))" method to deal with the problem
 * of creating objects without having to specify the exact class of the object that will be created.
 *
 * You can find examples of using this pattern in many places:
 * - Calendar.getInstance()
 * - JDBC.getConnection()
 * - DataSource.getConnection()
 * - and so on.
 */
public abstract class Computer {
    public static Computer getComputer(String type){
        Computer result = null;

        if ("pc".equals(type)) {
            result = new PC();
        }else if ("laptop".equals(type)){
            result = new Laptop();
        }

        return result;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    private static class PC extends Computer{

        @Override
        public void turnOn() {
            System.out.println("Push the turnOn button");
        }

        @Override
        public void turnOff() {
            System.out.println("Push the turnOff button");
        }
    }

    private static class Laptop extends Computer{

        @Override
        public void turnOn() {
            System.out.println("Find charge device, connect it to laptop and to outlet, then push the button");
        }

        @Override
        public void turnOff() {
            System.out.println("Push the turnOff button, disconnect charge device from outlet and from laptop and throw it somewhere");
        }
    }
}
