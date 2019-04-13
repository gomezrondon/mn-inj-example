import entities.Bar;
import io.micronaut.context.ApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = ApplicationContext.run();

        Bar bar = context.getBean(Bar.class);

        System.out.println(bar.bar());

        System.out.println("this is a test! ");
    }
}
