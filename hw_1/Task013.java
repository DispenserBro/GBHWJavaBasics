import java.util.Scanner;

//* Реализовать простой калькулятор (+ - / *)

public class Task013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866");

        System.out.print("Введите первое число: ");
        double number1 = Double.parseDouble(sc.nextLine());

        System.out.print("Введите действие: ");
        String action = sc.nextLine();

        System.out.print("Введите второе число: ");
        double number2 = Double.parseDouble(sc.nextLine());

        sc.close();

        System.out.print(number1 + " " + action + " " + number2 + " = ");

        switch (action) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Некорректное действие!");
        }
    }
}
