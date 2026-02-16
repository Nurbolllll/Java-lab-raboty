public class Lab2 {

    // Задача 3: поле класса
    int classField = 100;

    public static void main(String[] args) {

        System.out.println("Самостоятельная работа — Лабораторная 2\n");

        // ===== Задача 1. Переменные и константы =====
        int age = 18;
        double height = 1.93;
        boolean isStudent = true;
        final double PI = 3.14159;

        System.out.println("Задача 1:");
        System.out.println("Возраст: " + age);
        System.out.println("Рост: " + height);
        System.out.println("Студент: " + isStudent);
        System.out.println("Константа PI: " + PI + "\n");

        // ===== Задача 2. Примитивные и ссылочные типы =====
        int number = 25;              // примитивный тип
        String name = "Nurbol";       // ссылочный тип

        System.out.println("Задача 2:");
        System.out.println("Число (int): " + number);
        System.out.println("Имя (String): " + name);
        System.out.println("// int хранит значение напрямую, String — ссылку на объект\n");

        // ===== Задача 3. Область видимости переменных =====
        Lab2 obj = new Lab2();
        obj.showScope();

        // ===== Задача 4 и 5. Наследование и переопределение методов =====
        Person p = new Student("Иван", 19, "ИС24-22"); // ссылка базового класса
        System.out.println("\nЗадача 4 и 5:");
        p.displayInfo(); // демонстрация полиморфизма
    }

    // Метод для задачи 3
    void showScope() {
        int localVariable = 50; // локальная переменная

        System.out.println("Задача 3:");
        System.out.println("Поле класса: " + classField);
        System.out.println("Локальная переменная: " + localVariable);
        System.out.println("// Поле доступно во всех методах, локальная — только внутри этого метода\n");
    }
}

// ===== Задача 4. Базовый класс =====
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

// ===== Задача 4 и 5. Производный класс =====
class Student extends Person {
    String group;

    Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    // Переопределение метода
    @Override
    void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Группа: " + group);
    }
}