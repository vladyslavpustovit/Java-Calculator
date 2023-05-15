import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, I am a calculator");
        System.out.print("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scan.nextInt();

        int result;

        System.out.print("Choose a math operator: ");
        String oper = scan.nextLine();
        oper = scan.nextLine();

        switch (oper) {
            case "+":
                result = num1 + num2;
                System.out.println("Result is: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result is: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result is: " + result);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error");
                } else {
                    result = num1 / num2;
                    System.out.println("Result is: " + result);
                }
                break;
            default:
                System.out.println("Oopsie, something gone wrong");
                break;
        }
    }
}