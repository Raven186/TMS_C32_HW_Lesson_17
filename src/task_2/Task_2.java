package task_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате yyyy-MM-dd:");
        String input = scanner.nextLine();

        try {
            LocalDate date = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            String dayOfWeek = date.getDayOfWeek().toString();
            System.out.println("День недели: " + dayOfWeek);
        } catch (DateTimeParseException e) {
            System.out.println("Неверный формат даты. Пожалуйста, используйте формат yyyy-MM-dd.");
        }

        scanner.close();
    }
}
