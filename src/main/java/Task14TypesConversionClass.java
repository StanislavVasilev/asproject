import java.util.Scanner;

/**
 * Выполнение задания №14 блока 8 "Работа с данными"
 */
public class Task14TypesConversionClass {
  public static void main(String[] args) {
    Scanner in  = new Scanner(System.in);
    System.out.println("Введите любое целое число");
    String s = in.nextLine();
    System.out.println(s);
    int x = Integer.parseInt(s);
    System.out.println(x);
    double y =  x;
    System.out.println(y);
  }
}