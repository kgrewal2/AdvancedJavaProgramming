package FunctionalProgramming;

public class Lambdas {
    public static void main(String[] args) {
        GreetingMessage greetingLambda = (String name) -> {
            System.out.println("Hello using lambdas, " + name);
        };
        greetingLambda.greet("Elise");
    }
}
