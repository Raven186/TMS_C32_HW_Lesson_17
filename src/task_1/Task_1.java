package task_1;
import java.util.Scanner;

@FunctionalInterface
interface GenericFunction<T> {
    T apply(T value);
}
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 для реверса строки или 2 для расчета факториала:");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Task_1 task = new Task_1();

        if (choice == 1) {
            System.out.println("Введите строку для реверса:");
            String input = scanner.nextLine();

            GenericFunction<String> reverseString = str -> new StringBuilder(str).reverse().toString();
            System.out.println("Результат: " + reverseString.apply(input));
        } else if (choice == 2) {
            System.out.println("Введите число для расчета факториала:");
            int number = scanner.nextInt();

            GenericFunction<Integer> factorial = n -> {
                int result = 1;
                for (int i = 2; i <= n; i++) {
                    result *= i;
                }
                return result;
            };
            System.out.println("Факториал: " + factorial.apply(number));
        } else {
            System.out.println("Неверный выбор. Завершение программы.");
        }

        scanner.close();
    }
}
