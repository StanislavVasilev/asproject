import java.util.Scanner;

/**
 * Задание 7 блока 5 "Управляющие операторы условия и цикла"
 *
 * Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
 * В программе должны присутствовать константы X, Y, Z.
 * Программа должна сравнивать введенное значение с клавиатуры со значением констант
 * и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
 * Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 */
public class SwitchTaskClass {
  public static void main(String[] args) {
    final int X = 10;
    final int Y = 20;
    final int Z = 30;

    Scanner in = new Scanner(System.in);
    System.out.println("Введите число с клавиатуры: ");
    int number = in.nextInt();
    switch (number){
      case X:
      case Y:
      case Z:
        System.out.println("Данное значение имеется в константах");
        break;
      default:
        System.out.println("Такой константы нет!");
    }
  }
}
