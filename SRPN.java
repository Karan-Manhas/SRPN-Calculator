import java.util.Stack;


public class SRPN {


private Stack <Integer> stack = new Stack <Integer>(); // A Stack Structure that stores input and calculations.
// Methods that can only be accessed in the SRPN Class.
  private static final int MAX_INT = Integer.MAX_VALUE; // This is equal to 2147483647
 private static final int MIN_INT = Integer.MIN_VALUE; // This is equal to -2147483647

public void processCommand(String operation) { 

  /*
        // Conditional Statement Block
Series of If, else if statements which check the input (s) from the user of the program and then carries out appropriate functions based on the operator entered denoted by "+", "-", "*", "/", "%", "=", "d".

        //Data Dictionary of Code
- "+" : Sums Operator
- "-" : Subtract Operator 
- "/" : Divide Operator
- "*" : Multiplication Operator
- "+" : Divide Operator
- "d" : Prints out what is in the stack
- "=" : Prints what is at the top of the stack. 

  */
              // Conditional Statements Approach
                if (operation.equals("+")) { // Addition
                     if (stack.size() < 2) {
                        System.out.println("Stack underflow.");
                        return;
                    }
                    int number1 = stack.pop();
                    int number2 = stack.pop();
                    int result = number2 + number1;
                      if (number2 > 0 && number1 > 0 && result <= 0) {
                        stack.push(MAX_INT);
                    } else if (number2 < 0 && number1 < 0 && result >= 0) {
                        stack.push(MIN_INT);
                    } else {
                        stack.push(result);
                    }
                } else if (operation.equals("-")) { // Subtraction
                     if (stack.size() < 2) {
                        System.out.println("Stack underflow.");
                        return;
                    }
                    int number1 = stack.pop();
                    int number2 = stack.pop();
                    int result = number2 - number1;
                    if (number2 > 0 && number1 < 0 && result <= 0) {
                        stack.push(MAX_INT);
                    } else if (number2 < 0 && number1 > 0 && result >= 0) {
                        stack.push(MIN_INT);
                    } else {
                        stack.push(result);
                    }

                } else if (operation.equals("*")) { // Multiplication
                     if (stack.size() < 2) {
                        System.out.println("Stack underflow.");
                        return;
                    }
                    int number1 = stack.pop();
                    int number2 = stack.pop();
                    int result = number2 * number1;
              
                        if ((number1 > 0 && number2 > 0 && result <= 0) ||
                        (number1 > 0 && number2 < 0 && result >= 0) ||
                        (number1 < 0 && number2 > 0 && result >= 0)) {
                        stack.push(MAX_INT);
                    } else if (number1 == 0 || number2 == 0) {
                        stack.push(0);
                    } else if ((number1 < 0 && number2 < 0 && result <= 0)) {
                        stack.push(MIN_INT);
                    } else {
                        stack.push(result);
                    }

                } else if (operation.equals("/")) { // Division
                     if (stack.size() < 2) {
                        System.out.println("Stack underflow.");
                        return;
                    }
                    int number1 = stack.pop();
                    int number2 = stack.pop();
                      if (number1 == 0) {
                        System.out.println("Divide by 0.");
                        return;
                    } else {
                        int result = number2 / number1;
                        stack.push(result);
                    }
                } else if (operation.equals("%")) { // Modulo
                    if (stack.size() < 2) {
                        System.out.println("Stack underflow.");
                        return;
                    }
                    int number1 = stack.pop();
                    int number2 = stack.pop();
                       if (number1 == 0) {
                        System.out.println("Divide by 0.");
                        return;
                    } else {
                    int result = number2 % number1;
                    stack.push(result);
                       }
                } else if (operation.equals("=")) { // Peek 
                     if (stack.isEmpty()) {
                        System.out.println("Stack underflow.");
                        return;
                    }
                    System.out.println(stack.peek());
                } else if (operation.equals("d")) { // Prints whole stack
                    System.out.println(MIN_INT);
                }
                else{
                     stack.push(Integer.parseInt(operation));
                }
            }
        }
    
