import java.util.Scanner;
/**
 * Выполнение задания 4 блока 4"Основные операции для языка Java"
 *
 * Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран
 */
public class MainClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите число в бинарном формате");
    String number = in.nextLine();
    int num = Integer.parseInt(number, 2);
    System.out.println(num);
  }
}
