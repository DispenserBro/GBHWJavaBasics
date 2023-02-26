import java.util.LinkedList;
import java.util.Scanner;

public class Task043 {
    public static void main(String[] args) {
        LinkedList<Double> results = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        results.add(sc.nextDouble());
        sc.nextLine();

        while(true) {
            System.out.print("Enter operator (+, -, *, /, Cancel): ");
            String op = sc.nextLine();

            if ("".equals(op)) break;
            else if ("Cancel".equals(op) || "cancel".equals(op))
                if (results.size() < 2) {
                    results.removeFirst();
                    results.add(0.0);
                }
                else results.removeFirst();
            else {
                System.out.print("Enter second number: ");
                double secNumber = sc.nextDouble();

                process(results, op, secNumber);
                sc.nextLine();
                }

            System.out.println("Result: " + results.getFirst());
        }

        sc.close();
    }

    public static void process(LinkedList<Double> list, String op, double number) {
        switch (op) {
            case "+":
                list.add(0, list.getFirst() + number);
                break;
            
            case "-":
                list.add(0, list.getFirst() - number);
                break;

            case "*":
                list.add(0, list.getFirst() * number);
                break;
            
            case "/":
                if (number == 0) {
                    System.out.println("Cannot divide by zero!");
                    break;
                }
                list.add(0, list.getFirst() / number);
                break;
            
            default:
                System.out.println("Wrong operator!");
        }
    }
}
