import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Работа с линейными алгоритмами\n");

        // Задание 1
        int first = 8;
        int second = 12;
        int third = 5;
        int total = first + second + third;

        System.out.println("Задание 1:");
        System.out.println("Числа: " + first + ", " + second + ", " + third);
        System.out.println("Их сумма: " + total + "\n");

        // Задание 2
        double num1 = 15;
        double num2 = 4;

        System.out.println("Задание 2:");
        System.out.println("Сложение: " + (num1 + num2));
        System.out.println("Вычитание: " + (num1 - num2));
        System.out.println("Умножение: " + (num1 * num2));
        System.out.println("Деление: " + (num1 / num2) + "\n");

        // Задание 3
        int value = 20;
        System.out.println("Задание 3:");
        System.out.println("Было: " + value);
        value += 7;
        System.out.println("Стало: " + value + "\n");

        // Задание 4
        Scanner input = new Scanner(System.in);
        System.out.println("Задание 4:");
        System.out.print("Введите число: ");
        int userNum = input.nextInt();
        int result = userNum * userNum;
        System.out.println("Квадрат: " + result + "\n");

        // Задание 5
        System.out.println("Задание 5:");
        System.out.print("Введите длину: ");
        double len = input.nextDouble();
        System.out.print("Введите ширину: ");
        double wid = input.nextDouble();
        double square = len * wid;
        System.out.println("Площадь прямоугольника: " + square);

        input.close();
    }
}