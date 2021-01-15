package MethodReference;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(4);

        AreaCalculator areaCalculatorUsingLambda = (Square square) -> {
            return square.calculateArea();
        };

        AreaCalculator areaCalculatorUsingMethodReference = Square::calculateArea;

        System.out.println("Area: " + areaCalculatorUsingLambda.getArea(s));
        System.out.println("Area: " + areaCalculatorUsingMethodReference.getArea(s));
    }
}
