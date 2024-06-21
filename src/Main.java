import java.util.Scanner; /// Вызов класса позволяющего запросить ввод с клавиатыры

public class Main {
    public static void main(String[] args) {
        ///Задача 1
        System.out.println("Задача 1");

        Scanner scanner = new Scanner(System.in); /// Даем понять от куда запрашивать данные
        System.out.print("Введите возраст человека: ");
        int age = scanner.nextInt(); ///используем двнные введеные пользователем

        if (age >= 18) {
            System.out.println("Если возраст человека равен - " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен - " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        ///Задача 2
        System.out.println();
        System.out.println("Задача 2");

        System.out.print("Введите температуру на улице ");
        int temperature = scanner.nextInt();

        if (temperature < 5) {

            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        ///Задача 3
        System.out.println();
        System.out.println("Задача 3");

        System.out.print("Введите скорость водителя ");
        int speed = scanner.nextInt();

        if (speed > 60) {
            System.out.println("Если скорость - " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость - " + speed + ", то можно ездить спокойно");
        }

        /// Задача 4
        System.out.println();
        System.out.println("Задача 4");

        System.out.print("Введите возраст человека ");
        int age2 = scanner.nextInt();

        if (age2 < 2) {
            System.out.println("Если возраст человека равен - " + age2 + ", то ему пора спать.");
        } else if (age2 >= 2 && age2 <= 6) {
            System.out.println("Если возраст человека равен - " + age2 + ", то ему нужно ходить в детский сад.");
        } else if (age2 >= 7 && age2 <= 18) {
            System.out.println("Если возраст человека равен - " + age2 + ", то ему нужно ходить в школу.");
        }

    }
}