import java.util.Scanner;

public class Task014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine()
                             .replace(" = ", " ")
                             .replace(" + ", " ")
                             .split(" ");

        System.out.println(solveEquation(numbers));

        sc.close();
    }

    public static int parseNumber(String input, int replaceDig) {
        int res = 0;

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) res = res * 10 + Integer.parseInt(Character.toString(c));
            else res = res * 10 + replaceDig;
        }

        return res;
    }

    public static String solveEquation(String[] numbers) {
        int number1 = parseNumber(numbers[0], 0);
        int number2 = parseNumber(numbers[1], 0);
        int number3 = Integer.parseInt(numbers[2]);

        for (int i = 0; i < 10; i++) {
            number1 = parseNumber(numbers[0], i);

            for (int j = 0; j < 10; j++) {
                number2 = parseNumber(numbers[1], j);

                if (number1 + number2 == number3) {
                    break;
                }
            }

            if (number1 + number2 == number3) {
                    break;
                }
        }

        return number1 + " + " + number2 + " = " + number3;
    }
}
