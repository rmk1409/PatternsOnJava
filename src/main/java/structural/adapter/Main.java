package structural.adapter;

/**
 * Created by Roma on 08.09.2016.
 */
public class Main {
    public static void main(String[] args) {
        Client client = new Adaptor();
        client.getFood();
        client.removeEmptyPlate();
    }
}
