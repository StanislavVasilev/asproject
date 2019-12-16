import java.util.Scanner;

/**
 * Выполнение задачи №13 блока 7 "Строки в языке Java"
 * Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
 * Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
 */
public class Task13StringClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите произвольный текст_1 для сравнения");
    String firstString = in.nextLine();
    System.out.println("Введите произвольный текст_2 для сравнения");
    String secondString = in.nextLine();
    int firstStrLength = firstString.length();
    int secondStrLength = secondString.length();
    if (firstStrLength == secondStrLength) {
      System.out.println(String.format("Строки равны по длине: %s и %s", firstString, secondString));
    } else if (firstStrLength > secondStrLength) {
      System.out.println(String.format("Первая строка длиннее: %s", firstString ));
    } else System.out.println(String.format("Вторая строка длиннее: %s", secondString));
  }
}
