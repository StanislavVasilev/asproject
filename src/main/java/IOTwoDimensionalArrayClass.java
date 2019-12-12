import java.util.Scanner;

public class IOTwoDimensionalArrayClass {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите количество строк матрицы: ");
    int leftArrIndex = in.nextInt();
    System.out.println("Введите количество столбцов матрицы: ");
    int rightArrIndex = in.nextInt();
    int[][] intArr = new int[leftArrIndex][rightArrIndex];
    for (int i = 0; i < leftArrIndex; i++) {
      for (int k = 0; k < rightArrIndex; k++) {
        System.out.println("Введите значение " + k + " элемента в " + i + " строке матрицы");
        int num = in.nextInt();
        intArr[i][k] = num;
      }
    }
    for (int j = 0; j < rightArrIndex; j++) {
      int num = intArr[0][j];
      System.out.println( j + " элемент 1 строки матрицы(" + num + "), умноженный на 3 равен: " + num*3);
    }
  }
}