public class PracticalNo7A {
public int divide(int x, int y) throws ArithmeticException {

if (y == 0) {
throw new ArithmeticException("Division by zero");
}

return x / y;
}

public static void main(String[] args) {
int x = 50;
int y = 10;

PracticalNo7A solution = new PracticalNo7A();
try {
int result = solution.divide(x, y);
System.out.println("Result of " + x + " / " + y + " = " + result);
} catch (ArithmeticException e) {
System.out.println("Exception occurred: " + e.getMessage());
}
}
}