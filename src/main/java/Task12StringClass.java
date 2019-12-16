import java.util.Scanner;

/**
 * Задача 12 блока 7 "Строки в языке Java"
 * Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.
 */
public class Task12StringClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите произвольный текст");
    String text = in.nextLine();
    text = text.replace(" ", "");
    System.out.println("Введенный вами текст без пробелов выглядит так:  " + text);
  }
}
