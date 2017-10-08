package a;

import com.example.person.Person;

import java.util.logging.Logger;

public class HelloWorld {

    private static final Logger logger = Logger.getLogger("HelloWorld");
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println(new Person("Jim").getName());
    }
}
