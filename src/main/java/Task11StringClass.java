import java.util.Scanner;

/**
 * Задача 11 блока 7 "Строки в языке java"
 * Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.
 */
public class Task11StringClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите произвольный текст");
    String text = in.nextLine();
    System.out.println("Вы ввели: " + text);
  }
}
