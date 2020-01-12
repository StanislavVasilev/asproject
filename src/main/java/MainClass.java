import java.util.Arrays;
import java.util.Scanner;

/**
 * Итоговое задание №2
 * <p>
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
 * Пользователь программы должен задавать размер массива и наполнять его числами.
 * Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */
public class MainClass {
  public static void main(String[] args) {
    sortArr(getUserInputArr());
  }

  public static void sortArr(int[] arr) {
    int minIndex;
    for (int i = 0; i < arr.length - 1; i++) {
      minIndex = i;
      for (int j = i; j < arr.length; j++) {
        if (arr[minIndex] > arr[j]) {
          minIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
    System.out.println(Arrays.toString(arr));
  }

  public static int[] getUserInputArr() {
    System.out.println("Введите длинну масива");
    int length = getUserInput();
    int[] arr = new int[length];
    for (int i = 0; i < length; i++) {
      System.out.println(String.format("Введите %s элемент массива", i + 1));
      int element = getUserInput();
      arr[i] = element;
    }
    return arr;
  }

  public static int getUserInput() {
    Scanner in = new Scanner(System.in);
    return in.nextInt();
  }
}
