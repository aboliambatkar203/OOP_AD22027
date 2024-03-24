public class PracticalNo7B {
public void validate(int age) throws ArithmeticException {
if (age < 18) {
throw new ArithmeticException("Age must be 18 or older to vote");
} else {
System.out.println("Welcome to vote");
}
}

public static void main(String[] args) {
int age = 44;

PracticalNo7B validate = new PracticalNo7B ();
try {
validate.validate(age);
} catch (ArithmeticException e) {
System.out.println("Exception occurred: " + e.getMessage());
}
}
}