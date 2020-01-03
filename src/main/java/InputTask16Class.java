import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputTask16Class {
  /**
   * Выполнение задания 17 блока "Работа с файлами языка Java"
   * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
   */
  public static void main(String[] args) {
    try (BufferedReader reader = new BufferedReader(new FileReader(".txt")))
    {
      System.out.println(reader.readLine());
    }
    catch (IOException e){
      System.out.println("Ошибка ввода-вывода " + e);
    }
  }
}
