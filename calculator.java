import java.util.InputMismatchException;
import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        char operator;
        int First, Second, Result;
        Scanner input = new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, % , ^ or /");
        operator = input.next().charAt(0);
        try {
            System.out.println("Enter first number:");
            First = input.nextInt();
            System.out.println("Enter second number:");
            Second = input.nextInt();
            switch (operator) {
                case '+':
                    Result = First + Second;
                    System.out.println(First + " + " + Second + " = " + Result);
                    break;
                case '-':
                    Result = First - Second;
                    System.out.println(First + " - " + Second + " = " + Result);
                    break;
                case '*':
                    System.out.println(First + " * " + Second + " = " + Result);
                    break;
                case '%':
                    Result = First % Second;
                    System.out.println(First + " % " + Second + " = " + Result);
                    break;
                case '^':
                    Result = (int) Math.pow(First, Second);
                    System.out.println(First + " ^ " + Second + " = " + Result);
                    break;
                case '/': {
                    Result = First / Second;
                    System.out.println(First + " / " + Second + " = " + Result);
                    break;
                }
                default:
                    System.out.println("Error: Invalid operator.");
                    break;
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Only numerical inputs are allowed.");
        } finally {
            input.close();
        }
    }
}