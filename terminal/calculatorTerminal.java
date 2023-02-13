package terminal;

import java.util.InputMismatchException;
import java.util.Scanner;

class calculatorTerminal {
    public static void main(String[] args) {
        char operator;
        int First, Second, Result;
        Scanner input = new Scanner(System.in);
        try (input) {
            System.out.println("Choose an operator: +, -, *,  % , ?, ^, v or /");
            operator = input.next().charAt(0);
            System.out.println("Enter first number:");
            First = input.nextInt();
            System.out.println("Enter second number:");
            Second = input.nextInt();
            switch (operator) {
                case '+' -> {
                    Result = First + Second;
                    System.out.println(First + " + " + Second + " = " + Result);
                }
                case '-' -> {
                    Result = First - Second;
                    System.out.println(First + " - " + Second + " = " + Result);
                }
                case '*' -> {
                    Result = First * Second;
                    System.out.println(First + " * " + Second + " = " + Result);
                }
                case '%' -> {
                    Result = ((First - Second) * 100) / First;
                    System.out.println(First + " % " + Second + " = " + Result);
                }
                case '?' -> {
                    Result = First % Second;
                    System.out.println(First + " % " + Second + " = " + Result);
                }
                case '^' -> {
                    Result = (int) Math.pow(First, Second);
                    System.out.println(First + " ^ " + Second + " = " + Result);
                }
                case 'v' -> {
                    Result = (int) Math.sqrt(First);
                    System.out.println("v " + First + " = " + Result);
                }
                case '/' -> {
                    Result = First / Second;
                    System.out.println(First + " / " + Second + " = " + Result);
                }
                default -> System.out.println("Error: Invalid operator.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Only numerical inputs are allowed.");
        }
    }
}