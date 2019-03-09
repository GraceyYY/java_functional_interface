public class Test {
    public static void main(String[] args) {
        MathOperation<Integer> addition = (a, b) -> a + b;
        MathOperation<Integer> subtraction = (a, b) -> a - b;
        MathOperation<Integer> multiplication = (a, b) -> a * b;
        MathOperation<Double> division = (a, b) -> a / (double)b;

        Integer a = 4;
        Integer b = 2;
        System.out.println("addition: " + addition.operate(a,b));
        System.out.println("subtraction: " + subtraction.operate(a,b));
        System.out.println("multiplication: " + multiplication.operate(a,b));
        System.out.println("division: " + division.operate(a,b));
    }
}
