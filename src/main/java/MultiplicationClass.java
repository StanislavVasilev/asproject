import java.util.Scanner;

/**
 * Задание 5 блока 4 "Основные операции для языка java"
 *
 * Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
 */
public class MultiplicationClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите любое число");
    int num = in.nextInt();
    System.out.println("Таблица умножения для введенного числа " + num + ":\n"+ num + "\n" + num*2 + "\n" + num*3 + "\n" + num*4 + "\n" + num*5 + "\n" + num*6 + "\n" + num*7 + "\n" + num*8 + "\n" + num*9 + "\n" + num*10);
  }
}
