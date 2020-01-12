import java.util.Scanner;

/**
 * Итоговое задание №1.
 * <p>
 * Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
 * Необходимо использовать циклы,
 * нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.
 */

public class MainClass {
  public static void main(String[] args) {
    char[] charArr = getBinaryNum();
    int a = 0;
    int maxArrIndex = charArr.length-1;
    for (int i = 0; i <= maxArrIndex; i++) {
      int p = (int) Math.pow(2, maxArrIndex - i);
      int b = Character.getNumericValue(charArr[i]);
      a += (b * p);
    }
    System.out.println("Введенное вами число в десятичном формате: "+ a);
  }

  public static char[] getBinaryNum() {
    char[] charArr;
    do {
      String binaryNum = getUserInput();
      charArr = binaryNum.toCharArray();
      if (isBinary(charArr)) {
        break;
      }
    } while (true);
    return charArr;
  }

  public static boolean isBinary(char[] array) {
    for (char a : array) {
      if (a != '1' && a != '0') {
        System.out.println("Неверное число");
        return false;
      }
    } return true;
  }

  public static String getUserInput() {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите любое число в бинарном формате. \n Для ввода использовать символы '0' и '1'");
    return in.nextLine();
  }
}
