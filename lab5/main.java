import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1. Вывод чисел от 1 до N
        System.out.println("Задание 1");
        System.out.print("Введите число N: ");
        int n1 = scanner.nextInt();

        for (int i = 1; i <= n1; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задание 2. Сумма чисел от 1 до N
        System.out.println("Задание 2");
        System.out.print("Введите число N: ");
        int n2 = scanner.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= n2) {
            sum = sum + i;
            i++;
        }
        System.out.println("Сумма: " + sum);
        System.out.println();

        // Задание 3. Факториал числа N
        System.out.println("Задание 3");
        System.out.print("Введите число N: ");
        int n3 = scanner.nextInt();

        int factorial = 1;
        for (int j = 1; j <= n3; j++) {
            factorial = factorial * j;
        }
        System.out.println("Факториал: " + factorial);
        System.out.println();

        // Задание 4. Чётные числа от 1 до 100
        System.out.println("Задание 4");
        int k = 1;
        while (k <= 100) {
            if (k % 2 != 0) {
                k++;
                continue;
            }
            System.out.print(k + " ");
            k++;
        }
        System.out.println("\n");

        // Задание 5. Ввод чисел до нуля
        System.out.println("Задание 5");
        int number;
        int total = 0;

        do {
            System.out.print("Введите число (0 для выхода): ");
            number = scanner.nextInt();
            total = total + number;
        } while (number != 0);

        System.out.println("Сумма: " + total);

        scanner.close();
    }
}
