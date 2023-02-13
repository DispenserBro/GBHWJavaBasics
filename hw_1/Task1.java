import java.util.Scanner;

//* Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "cp866");

        System.out.println("Введите число для вычисления ");
        System.out.print("треугольного числа и факториала: ");

        int number = Integer.parseInt(sc.nextLine());
        sc.close();

        // Рекурсивные методы
        System.out.println("Рекурсивные методы:");
        System.out.println(recTriangNumber(number));
        System.out.println(recFactorial(number));

        // Стандартные методы
        System.out.println("Стандартные методы:");
        System.out.println(triangNumber(number));
        System.out.println(factorial(number));
    }

    public static int recTriangNumber(int number) {
        if (number < 1) return 0;
        return number + recTriangNumber(number - 1);
    }

    public static int recFactorial(int number) {
        if (number < 2) return 1;
        return number * recFactorial(number - 1);
    }

    public static int triangNumber(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) sum += i;

        return sum;
    }

    public static int factorial(int number) {
        int fact = 1;
        for (int i = 2; i <= number; i++) fact *= i;

        return fact;
    }
}