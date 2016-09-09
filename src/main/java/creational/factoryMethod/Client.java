package creational.factoryMethod;

/**
 * Created by Roma on 09.09.2016.
 */
public class Client {
    public static void main(String[] args) {
        Computer computer1 = Computer.getComputer("pc");
        Computer computer2 = Computer.getComputer("laptop");

        computer1.turnOn();
        computer2.turnOn();

        computer1.turnOff();
        computer2.turnOff();
    }
}
