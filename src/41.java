public class FinalProject {
    public static void main(String[] args) {
        // Example of a simple Java program with two main methods
        System.out.println("Hello, World!");
        // Another method to demonstrate inheritance
        SuperClass superclass = new MyClass();
        superclass.method1();  // Call method from subclass
    }
}

// Example of an abstract class with multiple abstract methods
abstract class AbstractClass {
    abstract void method1();
    abstract int method2();

    public static void main(String[] args) {
        System.out.println("Abstract class");
    }
}
