public class Main {

    public static void main(String[] args) {

        Main.print("This should be printed to the console"); // we can put Main before static method call, but don't have to
        print("Something to print", "Mickey");

        // static
        String hello = "     Hello World";
        String trimmedHello = hello.trim(); // trim is normal method, needs an object of type String to be used
        System.out.println("hello: " + hello + " |||trimmedHello: " + trimmedHello);

        // format is static method, we are calling it by class name, String.format
        System.out.println(String.format("hello: %s |||trimmedHello: %s", hello, trimmedHello));

        Main mainObject = new Main();
        mainObject.printHello(); // we need an object of our class Main to be able to call printHello method

        // pass by value: primitive types
        int a = 10;
        int copyOfInput = someTestMethod(a);
        System.out.println("Value of a is: " + a);
        System.out.println("Value of copyOfInput is: " + copyOfInput);

        // pass by value: reference types
        Demo demo1 = new Demo();
        System.out.println("Value of counter is " + demo1.counter);
        demo1.counter++;
        System.out.println("Value of counter is " + demo1.counter);
        Demo secondDemo = increaseCounter(demo1);
        System.out.println("Value of counter is " + demo1.counter);
        demo1.counter--;
        System.out.println("Value of counter is " + demo1.counter);
        System.out.println("Value of counter is " + secondDemo.counter);
    }

    static Demo increaseCounter(Demo input) {
        // Demo input = demo1;
        input.counter += 10;
        input = new Demo();
        System.out.println("increaseCounter: Value of counter is " + input.counter);
        return input;
    }

    static int someTestMethod(int input) {
        input++;
        System.out.println("Input: " + input);
        return input;
    }

    void printHello() {
        System.out.println("Hello");
    }

    static void print(String input) {
        System.out.println(input);
    }

    // this is not overloading, because return type is not part of the method signature
//    static String print(String input) {
//        System.out.println(input);
//        return input;
//    }

    static String print(String intput, String name) {
        print(intput);
        print(name);
        return name;
    }

    static void print(int input) {
        System.out.println(input);
    }

    // this shouldn't be done, overloaded method should do similar operation
    static double print(float input) {
        double result = input * input;
        return result;
    }

}