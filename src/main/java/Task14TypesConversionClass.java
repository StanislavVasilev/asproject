import java.util.Scanner;

/**
 * Выполнение задания №14 блока 8 "Работа с данными"
 * Необходимо написать программу, которая будет реализовывать следующие действия:
 *1. Ввод числа с клавиатуры и запись его в строковую переменную S
 *2. Конвертация строковой переменной S в числовую переменную X типа int
 *3. Конвертация числа X типа int в число Y типа double
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
