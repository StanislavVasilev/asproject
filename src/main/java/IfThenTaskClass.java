import java.util.Scanner;

/**
 * Задание 6 блока 5 "Управляющие операторы условия и цикла"
 *
 * Написать программу, которая будет выполнять следующие действия:
 *1. Ввод трех чисел с клавиатуры x, y, z
 *2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
 *3. Деление среднего арифметического на 2 без остатка
 *4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

public class IfThenTaskClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int x, y, z;
    System.out.println("Введите числло x: \n");
    x = in.nextInt();
    System.out.println("Введите числло y: \n");
    y = in.nextInt();
    System.out.println("Введите числло z: \n");
    z = in.nextInt();

    float averageFloat = (float) (x + y + z) / 3;
    System.out.println("Среднееарифметическое чисел: " + x + ", " + y + ", " + z + ", " + "равно: " + averageFloat);

    int halfAverage = (int) averageFloat / 2;
    System.out.println("Целое число от деления среднего арифметического на 2 = " + halfAverage);

    if (halfAverage > 3) {
      System.out.println("Программа выполнена корректно");
    }
  }
}
