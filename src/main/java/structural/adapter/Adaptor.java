package structural.adapter;

/**
 * Created by Roma on 08.09.2016.
 * Adaptor pattern allows to make communication between two different interfaces without modifying their source code.
 */
public class Adaptor implements Client{
    private Waitress waitress = new Waitress();

    @Override
    public void getFood() {
        waitress.cookFood();
        waitress.bringFood();
    }

    @Override
    public void removeEmptyPlate() {
        waitress.washDishes();
    }
}
