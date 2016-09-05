package structural.decorator;

import org.junit.Test;

import java.io.PrintStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by Roma on 05.09.2016.
 */
public class ConcreteComponentHelloTest {
    @Test
    public void doOperation() throws Exception {
        String fileName = "outTestDecorator.txt";
        PrintStream st = new PrintStream(fileName);
        System.setOut(st);

        //test
        Decorator decorator = new DecoratorLineBefore(new DecoratorStarAfter(new ConcreteComponentHello()));
        decorator.doOperation();

        List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.forName("UTF-8"));
        String content = lines.get(0).concat("\n")
                .concat(lines.get(1)).concat("\n")
                .concat(lines.get(2)).concat("\n");

        String actualStr = "----------\nHi! Have good days\n**********\n";

        assertTrue(actualStr.equals(content));
    }

}