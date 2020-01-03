import java.util.Arrays;
import java.util.Scanner;

/**
 * Выполнение задания 15 блока "Сортировка данных в массиве"
 * Написать программу сортировки по возрастанию заданного пользователем массива чисел.
 * Использовать пузырьковый метод сортировки.
 */
public class SortByBubbleClass {
  public static void main(String[] args) {
    int arrLength = inputArrLengthByUser(in());
    int[] arr = getArrFromUserInput(arrLength);
    System.out.println(Arrays.toString(arr));
    arr = getBubbleSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  private static int[] getBubbleSort(int[] arr){
    for (int i = arr.length-1; i > 0; i-- ){
      for (int j = 0; j < i; j++){
        if (arr[j] > arr[j+1]){
          int tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmp;
        }
      }
    }
    return arr;
  }
  private static int[] getArrFromUserInput(int arrLength){
    int[] arr = new int[arrLength];
    for (int i = 0; i < arrLength; i++){
      arr[i] = inputNum(in(), i);
    }
    return arr;
  }

  private static Scanner in(){
    return new Scanner(System.in);
  }
  private static int inputArrLengthByUser(Scanner in){
    System.out.println("Введите размер массива");
    return in.nextInt();
  }

  private static int inputNum(Scanner in, int index){
    System.out.println(String.format("Введите %s элемент массива", index+1));
    return in.nextInt();
  }

}
