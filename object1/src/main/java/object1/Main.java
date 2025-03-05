package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");    }

    Person person = new Person("Bob", 35, 70);

    Person[] people = new Person[10];
    Person person1 = new Person("Alice", 25, 70);
    Person person2 = new Person("Bob", 30, 80);

        Chair [] chair = new Chair[4];
        Chair char1 = new Chair("Wood", "Brown",4, false);

        Dog [] dog = new Dog[4];
        Dog dog1 = new Dog("Kyrpto", 12, "Alien");
        Dog dog2 = new Dog("Barry", 3, "Poodle");


}

