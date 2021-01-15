package FunctionalProgramming;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        GreetingMessage helloMessage = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        helloMessage.greet("Elise");
    }
}
