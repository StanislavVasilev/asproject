import java.io.*;
import java.util.Scanner;

public class IOTask18Class {
  /**
   * Выполнение задания 18 блока "Работа с файлами языка Java"
   * <p>
   * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
   * а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
   * Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
   */
  public static void main(String[] args) throws IOException {
    int rowsCount = getRowsCount();
    writeNewDataInFile(rowsCount);
  }

  private static int getRowsCount() {
    int count = 0;
    try (Scanner in = new Scanner(new File("file.txt"))) {
      System.out.println("Текстовые данные из файла: file.txt ");
      while (in.hasNextLine()) {
        System.out.println(in.nextLine());
        count++;
      }
    } catch (FileNotFoundException e) {
      System.out.println("Не найден файл " + e);
    }
    return count;
  }

  private static void writeNewDataInFile(int count) {
    String text;
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
      FileWriter writer = new FileWriter("file.txt", false);
      System.out.println("Введите новый текст для записи в файл");
      while (count > 0) {
        System.out.println(String.format("Осталось заполнить строк:  %s", count));
        text = reader.readLine();
        writer.append(text).append("\r\n");
        count--;
      }
      writer.close();
    } catch (IOException e) {
      System.out.println("Ошибка ввода-вывода " + e);
    }
  }
}
