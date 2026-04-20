import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите пример (1-10): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                // Пример 1
                System.out.print("Введите целое число: ");
                int n = sc.nextInt();

                if (n > 0)
                    System.out.println("Число положительное");
                else if (n < 0)
                    System.out.println("Число отрицательное");
                else
                    System.out.println("Число равно нулю");
                break;

            case 2:
                // Пример 2
                System.out.print("Введите балл (0-100): ");
                int score = sc.nextInt();

                if (score >= 90)
                    System.out.println("Оценка: 5");
                else if (score >= 75)
                    System.out.println("Оценка: 4");
                else if (score >= 60)
                    System.out.println("Оценка: 3");
                else if (score >= 50)
                    System.out.println("Оценка: 2");
                else
                    System.out.println("Оценка: 1");
                break;

            case 3:
                // Пример 3
                System.out.print("Введите первое число: ");
                int a = sc.nextInt();
                System.out.print("Введите второе число: ");
                int b = sc.nextInt();

                if (a > b)
                    System.out.println("Первое число больше");
                else if (a < b)
                    System.out.println("Второе число больше");
                else
                    System.out.println("Числа равны");
                break;

            case 4:
                // Пример 4
                System.out.print("Введите номер дня (1-7): ");
                int day = sc.nextInt();

                switch (day) {
                    case 1 -> System.out.println("Понедельник");
                    case 2 -> System.out.println("Вторник");
                    case 3 -> System.out.println("Среда");
                    case 4 -> System.out.println("Четверг");
                    case 5 -> System.out.println("Пятница");
                    case 6 -> System.out.println("Суббота");
                    case 7 -> System.out.println("Воскресенье");
                    default -> System.out.println("Неверный ввод");
                }
                break;

            case 5:
                // Пример 5
                System.out.print("Введите число: ");
                int x = sc.nextInt();

                if (x % 2 == 0)
                    System.out.println("Число чётное");
                else
                    System.out.println("Число нечётное");
                break;

            case 6:
                // Пример 6
                System.out.print("Введите возраст: ");
                int age = sc.nextInt();

                if (age >= 18)
                    System.out.println("Доступ разрешён");
                else
                    System.out.println("Доступ запрещён");
                break;

            case 7:
                // Пример 7
                System.out.print("Введите номер месяца (1-12): ");
                int month = sc.nextInt();

                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31 день");
                    case 4, 6, 9, 11 -> System.out.println("30 дней");
                    case 2 -> System.out.println("28 или 29 дней");
                    default -> System.out.println("Неверный номер месяца");
                }
                break;

            case 8:
                // Пример 8
                System.out.print("Введите температуру: ");
                int temp = sc.nextInt();

                if (temp < 0)
                    System.out.println("Холодно");
                else if (temp <= 25)
                    System.out.println("Тепло");
                else
                    System.out.println("Жарко");
                break;

            case 9:
                // Пример 9
                System.out.print("Введите число: ");
                int num = sc.nextInt();

                if (num >= 10 && num <= 50)
                    System.out.println("Число входит в диапазон");
                else
                    System.out.println("Число не входит в диапазон");
                break;

            case 10:
                // Пример 10
                System.out.print("Введите первое число: ");
                double n1 = sc.nextDouble();
                System.out.print("Введите второе число: ");
                double n2 = sc.nextDouble();
                System.out.print("Введите операцию (+ - * /): ");
                char op = sc.next().charAt(0);

                switch (op) {
                    case '+' -> System.out.println("Результат: " + (n1 + n2));
                    case '-' -> System.out.println("Результат: " + (n1 - n2));
                    case '*' -> System.out.println("Результат: " + (n1 * n2));
                    case '/' -> {
                        if (n2 != 0)
                            System.out.println("Результат: " + (n1 / n2));
                        else
                            System.out.println("Деление на ноль запрещено");
                    }
                    default -> System.out.println("Неверная операция");
                }
                break;

            default:
                System.out.println("Неверный номер примера");
        }

        sc.close();
    }
}