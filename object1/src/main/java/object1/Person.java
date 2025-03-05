package object1;

class Person {

        // Define Instance Variables
        // different for each object!
        String name;
        int age = 0;
        int height = 0;
        // Constructor
        public Person(String name, int age, int height) {
            this.name = name;
            this.age = age;
            this.height = height; //units are centimeters
        }

        public static void main(String[] args) {
            // Declare and initialize an object
            Person person1 = new Person("John", 30, 30);

            /* Now you can use the Object `person1` */

        }
    }

