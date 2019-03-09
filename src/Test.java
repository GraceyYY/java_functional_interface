public class Test {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        Integer a = 4;
        Integer b = 2;
        System.out.println("addition: " + addition.operate(a,b));
        System.out.println("subtraction: " + subtraction.operate(a,b));
        System.out.println("multiplication: " + multiplication.operate(a,b));
        System.out.println("division: " + division.operate(a,b));
    }
}
