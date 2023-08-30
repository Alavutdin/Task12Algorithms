package Lesson12.task2.home2;
/*Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.*/
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        String input = getNotEmptyUserInput();
        System.out.println("Вы ввели: " + input);
    }

    public static String getNotEmptyUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные:");
        System.out.print("> ");
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                if (input.isEmpty()) {
                    throw new Exception();
                }
                return input;

            } catch (Exception e) {
                System.out.println("Ввод не может быть пустым, повторите:");
                System.out.print("> ");
            }
        }
    }
}
