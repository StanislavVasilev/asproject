import java.util.Arrays;
import java.util.Scanner;

/**
 * Выполнение задания №9 блока 6 "Массивы в языке java"
 * Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
 * где каждый элемент массива умножается на 2. Размер массива задается пользователем.
 */
public class IOArrayClass {
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Задайте размер массива");
    int i = in.nextInt();
    int[] intArray = new int[i];
    int[] arr = new int[5];
    System.out.println(intArray.length);
    System.out.println(arr.length);
    for (int val = 0; val < intArray.length; val++){
      System.out.println("Введите значение " + (val+1) + " элемента массива");
      int num = in.nextInt();
      intArray[val] = num;
    }
    for (int k = 0; k < intArray.length; k++){
      System.out.println("Значение элемента массива с индексом " + k +  " равно " + intArray[k] + " и после умноженния на 2 =  " + intArray[k]*2);
    }

  }

}
