import java.util.Scanner;
public class VariableInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of text: ");
        String stringInput = scanner.nextLine();

        System.out.print("Enter an integer: ");
        int intInput = Integer.valueOf(scanner.nextLine());

        System.out.print("Enter a double: ");
        double doubleInput = Double.valueOf(scanner.nextLine());

        System.out.print("Enter a boolean value: ");
        boolean booleanInput = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + stringInput);
        System.out.println("Your integer is " + intInput);
        System.out.println("Your double is " + doubleInput);
        System.out.println("Your boolean is " + booleanInput);


    }
}
