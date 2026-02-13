class Person {

    // Constructor
    Person() {
        System.out.println("Person class");
    }
}

class Student extends Person {

    // Constructor
    Student() {
        super();   // Calls Person constructor
        System.out.println("Student class");
    }
}

public class SuperConstructorDemo {
    public static void main(String[] args) {

        // Creating Student object
        Student obj = new Student();
    }
}
